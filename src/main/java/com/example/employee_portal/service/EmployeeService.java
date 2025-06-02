package com.example.employee_portal.service;

import com.example.employee_portal.model.Employee;
import com.example.employee_portal.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

// Service class for managing employee-related operations through the swagger interface.
@Service
public class EmployeeService {

    public EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {  //Constructor injection for EmployeeRepository
        this.employeeRepository = employeeRepository;
    }

    public void addEmployee(Employee employee) {
        System.out.println("Adding employee: " + employee.getName() + ", Position: " + employee.getPosition());
        employeeRepository.save(employee);  // Save the employee to the repository
    }

    public List<Employee> getAllEmployees() {
        System.out.println("Retrieving all employees");
        return employeeRepository.findAll();  // Retrieve all employees from the repository
    }

    public Employee getEmployeeById(Long id) {
        return employeeRepository.findById(id).get(); // Retrieve an employee by ID, or return null if not found;

    }

    public Long countEmployees() {
        return employeeRepository.count(); // Count the number of employees in the repository
    }

    public void updateEmployee(Employee employee) {
        employeeRepository.save(employee); // Update the employee in the repository
        System.out.println("Updating employee with ID: " + employee.getId() + "New Name: " + employee.getName() + ", Position: " + employee.getPosition());
    }

    public void deleteEmployee(Long id) {
        System.out.println("Deleting employee with ID: " + id);
        employeeRepository.deleteById(id); // Delete the employee by ID from the repository
    }
}
// This service class provides methods to manage employees, including adding, retrieving, counting, deleting, and updating employees.
