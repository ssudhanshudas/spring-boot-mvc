package com.jedify.api;

import com.jedify.employee.exception.NoMatchingRecordFoundException;
import com.jedify.employee.service.EmployeeService;
import com.jedify.employee.model.Employee;
import com.jedify.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by j1013575 on 10/31/2015.
 */
@RestController
@RequestMapping(value = Routes.EMPLOYEE_HOME)
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value = Routes.LIST_EMPLOYEE, method = RequestMethod.GET)
    public List<Employee> listEmployees(){
        return employeeService.lisEmployees();
    }
    @RequestMapping(value = Routes.GET_EMPLOYEE_BY_ID, method = RequestMethod.GET)
    public Employee findEmployeeById(@PathVariable(value = "id") String id) throws NoMatchingRecordFoundException {
        return employeeService.getEmployeeById(id);
    }

    @ExceptionHandler(value = NoMatchingRecordFoundException.class)
    public Message handleNoDataException(NoMatchingRecordFoundException e){
        return new Message(e.getMessage(), "No matching records", "");
    }
}
