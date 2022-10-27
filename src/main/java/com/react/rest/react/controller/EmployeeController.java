package com.react.rest.react.controller;

import com.react.rest.react.entity.Employee;
import com.react.rest.react.repository.EmployeeRepo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class HomeController {
  private final EmployeeRepo repo;
  public HomeController(EmployeeRepo repo) {
    this.repo = repo;
  }

  @GetMapping("/employees")
  List<Employee> all(){
    return repo.findAll();
  }

  @GetMapping("/employees/{id}")
  Employee one(@PathVariable Long id){
    return repo.findById(id);
  }

}
