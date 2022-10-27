package com.react.rest.react.controller;

import com.react.rest.react.entity.Employee;
import com.react.rest.react.exception.EmployeeNotFoundException;
import com.react.rest.react.repository.EmployeeRepo;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class EmployeeController {
  private final EmployeeRepo repo;
  public EmployeeController(EmployeeRepo repo) {
    this.repo = repo;
  }

  // Get All Employees
  @GetMapping("/employees")
  public List<Employee> all(){
    return repo.findAll();
  }

  // Get one Employee
  @GetMapping("/employees/{id}")
  public Employee one(@PathVariable Long id){
    return repo.findById(id)
        .orElseThrow(() -> new EmployeeNotFoundException(id));
  }

  // Add an Employee
  @PostMapping("/employees/{id}")
  public Employee newEmpoyee(@RequestBody Employee newEmployee){
    return repo.save(newEmployee);
  }

  // Update an employee
  @PatchMapping("/employees/{id}")
  public Employee update(@RequestBody Employee newEmployee, @PathVariable Long id){
    return repo.findById(id)
        .map(employee -> {
          employee.setFirstName(newEmployee.getFirstName());
          employee.setLastName(newEmployee.getLastName());
          employee.setDescription(newEmployee.getDescription());
          return repo.save(employee);
        }).orElseGet(() -> {
          newEmployee.setId(id);
          return repo.save(newEmployee);
        });
  }

  @DeleteMapping("/employees/{id}")
  public void deleteEmployee(@PathVariable Long id){
    repo.deleteById(id);
  }

}
