package com.employee.employeeproject.employeecontroller;

import com.employee.employeeproject.dto.EmployeeDto;
import com.employee.employeeproject.dto.ResponseDto;
import com.employee.employeeproject.entity.Employee;
import com.employee.employeeproject.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    IEmployeeService iEmployeeService;

    //adding an employee and saving to DB using post mapping and taking the input by RequestBody
    @PostMapping("/adding")
    public ResponseEntity<ResponseDto> createEmployee(@Valid @RequestBody EmployeeDto employeeDto) {
        Employee employee = iEmployeeService.addEmployee(employeeDto);
        ResponseDto responseDto = new ResponseDto("Employee added Successfully", employee);
        return new ResponseEntity<>(responseDto, HttpStatus.CREATED);
    }
    //getting all the employee and showing in a list form from the DB using get mapping
    @GetMapping("/showall")
    public ResponseEntity<ResponseDto> getAllEmployees(){
        ResponseDto responseDto = new ResponseDto("Employee List shown Bellow", iEmployeeService.getAllEmployees());
        return new ResponseEntity<>(responseDto, HttpStatus.OK);
    }
    //getting the employee with a particular id from the DB and showing using get mapping
    @GetMapping("/show/{id}")
    public ResponseEntity<ResponseDto> getByEmployee(@PathVariable int id){
        ResponseDto responseDto = new ResponseDto("Employee with id "+id+" Shown bellow", iEmployeeService.getById(id));
        return new ResponseEntity<>(responseDto, HttpStatus.OK);
    }
//deleting the employee with a particular id from the DB using Delete mapping
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<ResponseDto> deleteEmployee(@PathVariable int id) {
        ResponseDto responseDto = new ResponseDto("Employee with id "+id+" Deleted Successfully", iEmployeeService.deleteById(id));
        return new ResponseEntity<>(responseDto, HttpStatus.OK);
    }
    //getting the employee with a particular id from the DB and updating the data and storing to DB using put mapping
    @PutMapping("/edit/{id}")
    public ResponseEntity<ResponseDto> editEmployee(@Valid @RequestBody EmployeeDto employeeDto, @PathVariable int id) {
        ResponseDto responseDto = new ResponseDto("Employee with id "+id+" Updated Successfully", iEmployeeService.editEmployee(employeeDto, id));
        return new ResponseEntity<>(responseDto, HttpStatus.OK);
    }
}
