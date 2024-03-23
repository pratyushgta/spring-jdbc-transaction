package com.transaction.example.transactiondemo.service;

import com.transaction.example.transactiondemo.entity.Employee;
import com.transaction.example.transactiondemo.entity.EmployeeHealthInsurance;

public interface OrganizationService {

    public void joinOrganization(Employee employee, EmployeeHealthInsurance employeeHealthInsurance);

    public void leaveOrganization(Employee employee, EmployeeHealthInsurance employeeHealthInsurance);

}