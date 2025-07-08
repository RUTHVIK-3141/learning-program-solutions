package com.example.jpa_demo;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    private final EmployeeService service;

    public EmployeeController(EmployeeService service) {
        this.service = service;
    }

    @PostMapping
    public Employee create(@RequestBody Employee e) {
        return service.addEmployee(e);
    }

    @GetMapping
    public List<Employee> all() {
        return service.listAll();
    }
}
