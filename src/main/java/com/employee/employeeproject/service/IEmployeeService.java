package com.employee.employeeproject.service;


import com.employee.employeeproject.dto.EmployeeDto;
import com.employee.employeeproject.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface IEmployeeService {

    Employee addEmployee(EmployeeDto employeeDto);

    List<Employee> getAllEmployees();

    Optional<Employee> getById(int id);

    String deleteById(int id);

    String editEmployee(EmployeeDto employeeDto, int id);

    List<Employee> getEmployeeByDepartment(String department);
}
