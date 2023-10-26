package com.swacorp.codefatherbackend.service;

import com.swacorp.codefatherbackend.model.Employee;
import com.swacorp.codefatherbackend.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.StreamSupport;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> findAll(){
        return StreamSupport.stream(employeeRepository.findAll().spliterator(), false)
                .toList();
    }

}
