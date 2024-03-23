package com.transaction.example.transactiondemo.service;

import com.transaction.example.transactiondemo.entity.Employee;

public interface EmployeeService {
    void insertEmployee(Employee emp);

    void deleteEmployeeById(String empid);
}
