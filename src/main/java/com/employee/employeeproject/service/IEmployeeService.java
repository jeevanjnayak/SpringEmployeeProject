package com.employee.employeeproject.service;


import com.employee.employeeproject.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface IEmployeeService {

    Employee addEmployee(Employee employee);

    List<Employee> getAllEmployees();

    Optional<Employee> getById(int id);

    String deleteById(int id);

    Employee editEmployee(Employee employee, int id);
}
