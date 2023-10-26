package com.swacorp.codefatherbackend.controller;

import com.swacorp.codefatherbackend.model.Employee;
import com.swacorp.codefatherbackend.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees/")
    public List<Employee> getAllEmployees(){
        return employeeService.findAll();
    }
}
