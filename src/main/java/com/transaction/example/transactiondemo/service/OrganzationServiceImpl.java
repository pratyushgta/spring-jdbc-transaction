/**
 * MSA-E10
 *
 * @author Pratyush Kumar (github.com/pratyushgta)
 */
package com.transaction.example.transactiondemo.service;

import com.transaction.example.transactiondemo.entity.Employee;
import com.transaction.example.transactiondemo.entity.EmployeeHealthInsurance;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrganzationServiceImpl implements OrganizationService {

    @Autowired
    EmployeeService employeeService;

    @Autowired
    HealthInsuranceService healthInsuranceService;

    @Override
    @Transactional
    public void joinOrganization(Employee employee, EmployeeHealthInsurance employeeHealthInsurance) {
        employeeService.insertEmployee(employee);
        if (employee.getEmpId().equals("1")) {
            throw new RuntimeException(">>> Throwing exception to test transaction rollback <<<");
        }
        healthInsuranceService.registerEmployeeHealthInsurance(employeeHealthInsurance);
    }

    @Override
    @Transactional
    public void leaveOrganization(Employee employee, EmployeeHealthInsurance employeeHealthInsurance) {
        employeeService.deleteEmployeeById(employee.getEmpId());
        healthInsuranceService.deleteEmployeeHealthInsuranceById(employeeHealthInsurance.getEmpId());
    }
}
