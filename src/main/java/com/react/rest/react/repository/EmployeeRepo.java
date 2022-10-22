package com.react.rest.react.repository;

import com.react.rest.react.entity.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepo
    extends CrudRepository<Employee, Long> {
}
