package com.react.rest.react;

import com.react.rest.react.entity.Employee;
import com.react.rest.react.repository.EmployeeRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class LoadData implements CommandLineRunner {

  private final EmployeeRepo repo;
  private final Logger log = LoggerFactory.getLogger(LoadData.class);

  @Autowired
  public LoadData(EmployeeRepo repo){
    this.repo = repo;
  }


  @Override
  public void run(String... args) throws Exception {
    repo.save(new Employee("Frodo", "Baggins", "Ring Bearer"));
    repo.save(new Employee("Bilbo", "Baggins", "Burglar"));
    repo.save(new Employee("Legolas", "Greenleaf", "Elf"));
    repo.save(new Employee("Samwise", "Gamgee", "Gardener"));
    repo.save(new Employee("Gandalf", "The Grey", "Wizard"));
    repo.save(new Employee("Gimli", "Durin", "Warrior"));

    repo.findAll().forEach(employee -> log.info("Preloaded " + employee));
  }
}
