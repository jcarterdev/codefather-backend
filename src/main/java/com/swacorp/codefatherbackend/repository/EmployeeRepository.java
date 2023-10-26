package com.swacorp.codefatherbackend.repository;

import com.swacorp.codefatherbackend.model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {


}
