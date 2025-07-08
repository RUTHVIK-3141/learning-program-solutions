package com.example.jpa_demo;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeService {
    private final EmployeeRepository repo;

    public EmployeeService(EmployeeRepository repo) {
        this.repo = repo;
    }

    @Transactional
    public Employee addEmployee(Employee e) {
        return repo.save(e);
    }

    public List<Employee> listAll() {
        return repo.findAll();
    }
}
