/**
 *
 * MSA-E10
 *
 * @author Pratyush Kumar (github.com/pratyushgta)
 */
package com.transaction.example.transactiondemo.dao;


import com.transaction.example.transactiondemo.entity.EmployeeHealthInsurance;

public interface HealthInsuranceDao {
    void registerEmployeeHealthInsurance(EmployeeHealthInsurance employeeHealthInsurance);

    void deleteEmployeeHealthInsuranceById(String empid);
}