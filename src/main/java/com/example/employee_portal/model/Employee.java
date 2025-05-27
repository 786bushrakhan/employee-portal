package com.example.employee_portal.model;

public class Employee {

    private final String name;

    public String getName() {
        return name;
    }

    private final String position;

    public String getPosition() {
        return position;
    }

    public Employee(String name, String position) {
        this.name = name;
        this.position = position;
    }
}
