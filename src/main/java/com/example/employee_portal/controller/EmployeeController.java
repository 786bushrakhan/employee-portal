package com.example.employee_portal.controller;

import com.example.employee_portal.model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {
    // Define endpoints for employee-related operations here
    // For example, you can add methods to handle CRUD operations for employees

    // Example endpoint
    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        //return employeeService.getAllEmployees();
        //return List.of("John Doe", "Jane Smith", "Alice Johnson");
        return List.of(
                new Employee("John Doe", "Software Engineer"),
                new Employee("Jane Smith", "Project Manager"),
                new Employee("Alice Johnson", "QA Engineer")
        );
    }

    // Add more methods as needed for your application
}
