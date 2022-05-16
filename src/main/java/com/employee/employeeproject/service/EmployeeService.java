package com.employee.employeeproject.service;

import com.employee.employeeproject.entity.Employee;
import com.employee.employeeproject.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService implements IEmployeeService{
    @Autowired
    EmployeeRepository employeeRepository;


    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Optional<Employee> getById(int id) {
        return employeeRepository.findById(id);
    }

    public String deleteById(int id) {
        employeeRepository.deleteById(id);
        return "Employee with ID: " + id + " is Deleted Successfully!!";
    }

    public Employee editEmployee(Employee employee, int id) {
        if (employeeRepository.findById(id).isPresent()) {
            employee.setId(id);
            return employeeRepository.save(employee);
        }
        return null;
    }
}