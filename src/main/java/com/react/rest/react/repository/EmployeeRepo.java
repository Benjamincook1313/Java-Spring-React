package com.react.rest.react.repository;

import com.react.rest.react.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo
    extends JpaRepository<Employee, Long> {
}
