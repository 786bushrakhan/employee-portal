package com.example.employee_portal.controller;

import com.example.employee_portal.model.Employee;
import com.example.employee_portal.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    // Define endpoints for employee-related operations here
    // For example, you can add methods to handle CRUD operations for employees

    // Example endpoint to get all employees

    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
        //return List.of("John Doe", "Jane Smith", "Alice Johnson");
        //return getEmployees();
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
        return employeeService.getEmployeeById(id);
        /*return getEmployees().stream()// for loop java 8 feature
                .filter(employee -> employee.getId().equals(id))
                .findFirst()
                .orElse(null);*/ // Handle not found case appropriately
    }

    // Endpoint to count the number of employees
    @GetMapping("/employees/count")
    public Long countEmployees() {
        return employeeService.countEmployees();
        //return getEmployees().size();
    }

    // Endpoint to get employee names
    @GetMapping("/employees/names")
    public List<String> getEmployeeNames() {
        //return employeeService.getEmployeeNames();
        return getEmployees().stream()
                .map(Employee::getName)
                .toList();
    }

    // Endpoint to get employee positions
    @GetMapping("/employees/positions")
    public List<String> getEmployeePositions() {
        return getEmployees().stream()
                .map(Employee::getPosition)
                .toList();
    }

    // Endpoint to add a new employee (for demonstration purposes)
    @PostMapping("/employees")
    public void addEmployee(@RequestBody Employee employee) {
        employeeService.addEmployee(employee);
    }

    // Add more methods as needed for your application

    // Endpoint to update an employee (for demonstration purposes)
    @PutMapping("/employees")
    public void updateEmployee(@RequestBody Employee updatedEmployee) {
        employeeService.updateEmployee(updatedEmployee);
    }


    // Endpoint to delete an employee by ID
    @DeleteMapping("/employees/{id}")
    public void deleteEmployee(@PathVariable Long id) {
        employeeService.deleteEmployee(id);
    }

}

