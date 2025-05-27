package com.example.employee_portal.controller;

import com.example.employee_portal.model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
        return getEmployees();
    }

    private static List<Employee> getEmployees() {
        return List.of(
                new Employee(1L, "John Doe", "Software Engineer"),
                new Employee(2L, "Jane Smith", "Project Manager"),
                new Employee(3L, "Alice Johnson", "QA Engineer")
        );
    }

    // Example endpoint to get a specific employee by ID
    @GetMapping("/employees/{id}")
    public Employee getEmployeeById(@PathVariable Long id) {
        //return employeeService.getEmployeeById(id);
        return getEmployees().stream()
                .filter(employee -> employee.getId().equals(id))
                .findFirst()
                .orElse(null); // Handle not found case appropriately
    }


    // Add more methods as needed for your application
}
