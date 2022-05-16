package com.employee.employeeproject.service;

import com.employee.employeeproject.dto.EmployeeDto;
import com.employee.employeeproject.entity.Employee;
import com.employee.employeeproject.repository.IEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService implements IEmployeeService{
    @Autowired
    IEmployeeRepository iEmployeeRepository;


    public Employee addEmployee(Employee employee) {
        return iEmployeeRepository.save(employee);
    }

    public List<Employee> getAllEmployees() {
        return iEmployeeRepository.findAll();
    }

    public Optional<Employee> getById(int id) {
        return iEmployeeRepository.findById(id);
    }

    public String deleteById(int id) {
        if (iEmployeeRepository.findById(id).isPresent()) {
            iEmployeeRepository.deleteById(id);
            return "Employee ID: " + id + " is Deleted!";
        }
        return "Employee not present!";
    }

    public Employee editEmployee(Employee employee, int id) {
        if (iEmployeeRepository.findById(id).isPresent()) {
            employee.setId(id);
            return iEmployeeRepository.save(employee);
        }
        return null;
    }
}