package com.employee.employeeproject.employeecontroller;

import com.employee.employeeproject.entity.Employee;
import com.employee.employeeproject.service.EmployeeService;
import com.employee.employeeproject.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    IEmployeeService iEmployeeService;
    @PostMapping()
    public Employee createEmployees(@RequestBody Employee employee){
        return iEmployeeService.addEmployee(employee);
    }
    @GetMapping()
    public List<Employee> getAllEmployees(){
        return iEmployeeService.getAllEmployees();
    }
    @GetMapping("/{id}")
    public Optional<Employee> getByEmployee(@PathVariable int id){
        return iEmployeeService.getById(id);
    }
    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable int id){
        return iEmployeeService.deleteById(id);
    }
    @PutMapping("/{id}")
    public Employee editEmployee(@RequestBody Employee employee, @PathVariable int id){
        return iEmployeeService.editEmployee(employee, id);
    }
}
