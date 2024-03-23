/**
 * MSA-E10
 *
 * @author Pratyush Kumar (github.com/pratyushgta)
 */
package com.transaction.example.transactiondemo.service;

import com.transaction.example.transactiondemo.dao.EmployeeDao;
import com.transaction.example.transactiondemo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeDao employeeDao;

    @Override
    public void insertEmployee(Employee employee) {
        employeeDao.insertEmployee(employee);
    }

    @Override
    public void deleteEmployeeById(String empid) {
        employeeDao.deleteEmployeeById(empid);
    }

}