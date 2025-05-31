package com.example.employee_portal.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {

    public Employee() {
        this.id = null; // Default constructor for JPA
        this.name = null;
        this.position = null;
    }

    public Employee(Long id, String name, String position) {
        this.id = id;
        this.name = name;
        this.position = position;
    }

    @Id
    private final Long id;

    public Long getId() {
        return id;
    }

    private final String name;

    public String getName() {
        return name;
    }

    private final String position;

    public String getPosition() {
        return position;
    }
}
