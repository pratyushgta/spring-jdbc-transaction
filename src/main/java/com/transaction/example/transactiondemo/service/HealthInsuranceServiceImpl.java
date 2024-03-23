/**
 * MSA-E10
 *
 * @author Pratyush Kumar (github.com/pratyushgta)
 */
package com.transaction.example.transactiondemo.service;

import com.transaction.example.transactiondemo.dao.HealthInsuranceDao;
import com.transaction.example.transactiondemo.entity.EmployeeHealthInsurance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HealthInsuranceServiceImpl implements HealthInsuranceService {

    @Autowired
    HealthInsuranceDao healthInsuranceDao;

    @Override
    public void registerEmployeeHealthInsurance(EmployeeHealthInsurance employeeHealthInsurance) {
        healthInsuranceDao.registerEmployeeHealthInsurance(employeeHealthInsurance);
    }

    @Override
    public void deleteEmployeeHealthInsuranceById(String empid) {
        healthInsuranceDao.deleteEmployeeHealthInsuranceById(empid);
    }

}