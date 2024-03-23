/**
 *
 * MSA-E10
 *
 * @author Pratyush Kumar (github.com/pratyushgta)
 */
package com.transaction.example.transactiondemo.dao;


import com.transaction.example.transactiondemo.entity.Employee;

public interface EmployeeDao {
    void insertEmployee(Employee cus);

    void deleteEmployeeById(String empid);
}
