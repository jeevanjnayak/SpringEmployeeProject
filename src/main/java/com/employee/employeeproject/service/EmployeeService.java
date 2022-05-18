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

//adding an employee and saving to DB
    public Employee addEmployee(EmployeeDto employeeDto) {
        Employee employee = new Employee(employeeDto);
        return iEmployeeRepository.save(employee);
    }
//getting all the employee and showing in a list form from the DB
    public List<Employee> getAllEmployees() {
        return iEmployeeRepository.findAll();
    }
    //getting the employee with a particular id from the DB and showing
    public Optional<Employee> getById(int id) {
        return iEmployeeRepository.findById(id);
    }
//    deleting the employee with a particular id from the DB
    public String deleteById(int id) {
        if (iEmployeeRepository.findById(id).isPresent()) {
            iEmployeeRepository.deleteById(id);
            return "Employee ID: " + id + " is Deleted!";
        }
        return "Employee not present!";
    }
//getting the employee with a particular id from the DB and updating the data and storing to DB
    public String editEmployee(EmployeeDto employeeDto, int id) {
        if (iEmployeeRepository.findById(id).isPresent()) {
            Employee employee = new Employee(employeeDto , id);
            employee.setId(id);
            Employee string = iEmployeeRepository.save(employee);
            return string.toString();
        }
        return null;
    }
}