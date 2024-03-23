/**
 * MSA-E10
 *
 * @author Pratyush Kumar (github.com/pratyushgta)
 */
package com.transaction.example.transactiondemo;

import com.transaction.example.transactiondemo.entity.Employee;
import com.transaction.example.transactiondemo.entity.EmployeeHealthInsurance;
import com.transaction.example.transactiondemo.service.OrganizationService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class TransactionDemoApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(TransactionDemoApplication.class, args);
        OrganizationService organizationService = context.getBean(OrganizationService.class);

        Employee emp = new Employee();
        emp.setEmpId("1");
        emp.setEmpName("Tiger");

        EmployeeHealthInsurance employeeHealthInsurance = new EmployeeHealthInsurance();
        employeeHealthInsurance.setEmpId("1");
        employeeHealthInsurance.setHealthInsuranceSchemeName("Health+");
        employeeHealthInsurance.setCoverageAmount(6300);

        organizationService.joinOrganization(emp, employeeHealthInsurance);
    }
}

