/**
 * MSA-E10
 *
 * @author Pratyush Kumar (github.com/pratyushgta)
 */
package com.transaction.example.transactiondemo.dao;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import com.transaction.example.transactiondemo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDaoImpl extends JdbcDaoSupport implements EmployeeDao {

    @Autowired
    DataSource dataSource;

    @PostConstruct
    private void initialize() {
        setDataSource(dataSource);
    }

    @Override
    public void insertEmployee(Employee emp) {
        String sql = "INSERT INTO employee " + "(empId, empName) VALUES (?, ?)";
        getJdbcTemplate().update(sql, new Object[]{emp.getEmpId(), emp.getEmpName()});
    }

    @Override
    public void deleteEmployeeById(String empid) {
        String sql = "DELETE FROM employee WHERE empId = ?";
        getJdbcTemplate().update(sql, new Object[]{empid});

    }
}