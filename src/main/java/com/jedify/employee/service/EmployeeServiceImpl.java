package com.jedify.employee.service;

import com.jedify.employee.exception.NoMatchingRecordFoundException;
import com.jedify.employee.model.Employee;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by j1013575 on 10/31/2015.
 */
@Service
public class EmployeeServiceImpl implements EmployeeService{

    List<Employee> employees;

    @PostConstruct
    public void init(){
        employees = new ArrayList<>();
        employees.add(new Employee("Sudhanshu Das", "EPM123", "Hyderabad", "JDA Software"));
        employees.add(new Employee("Amit Gupta", "EPM124", "Hyderabad", "JDA Software"));
    }
    @Override
    public List<Employee> lisEmployees() {
        return employees;
    }

    @Override
    public Employee getEmployeeById(String id) throws NoMatchingRecordFoundException {
        for (Employee employee: employees){
            if(employee.getId().equalsIgnoreCase(id))
                return employee;
        }
        throw new NoMatchingRecordFoundException("Record Not found for the id : " + id);
    }
}
