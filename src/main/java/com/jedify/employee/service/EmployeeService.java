package com.jedify.employee.service;

import com.jedify.employee.exception.NoMatchingRecordFoundException;
import com.jedify.employee.model.Employee;

import java.util.List;

/**
 * Created by j1013575 on 10/31/2015.
 */
public interface EmployeeService {
    List<Employee> lisEmployees();

    Employee getEmployeeById(String id) throws NoMatchingRecordFoundException;
}
