package com.example;

import jakarta.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "role")
    private String role;

    public Employee() {}

    public Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    // Getters/Setters
    public Integer getId() { return id; }
    public String getName() { return name; }
    public String getRole() { return role; }

    public void setId(Integer id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setRole(String role) { this.role = role; }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "', role='" + role + "'}";
    }
}
