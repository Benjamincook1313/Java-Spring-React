package com.react.rest.react.controller;

import com.react.rest.react.entity.Employee;
import com.react.rest.react.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/employees")
public class HomeController {

  @Autowired
  private EmployeeRepo repo;

  @GetMapping("")
  public Iterable<Employee> getAll() {
    return repo.findAll();
  }

}
