package com.react.rest.react.repository;

import com.react.rest.react.entity.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo
    extends CrudRepository<Employee, Long> {
}
