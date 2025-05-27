package com.example.employee_portal.model;

public class Employee {
    public Employee(Long id, String name, String position) {
        this.id = id;
        this.name = name;
        this.position = position;
    }

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
