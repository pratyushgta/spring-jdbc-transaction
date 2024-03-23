package com.transaction.example.transactiondemo.service;

import com.transaction.example.transactiondemo.entity.EmployeeHealthInsurance;

public interface HealthInsuranceService {
    void registerEmployeeHealthInsurance(EmployeeHealthInsurance employeeHealthInsurance);

    void deleteEmployeeHealthInsuranceById(String empid);
}
