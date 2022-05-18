package com.employee.employeeproject.entity;

import com.employee.employeeproject.dto.EmployeeDto;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Data
@ToString
@RequiredArgsConstructor

@Entity
public class Employee {
    @Id
    @GeneratedValue
    private int id;
    private String fullName;
    private String profilePic;
    private String gender;
    private int salary;
    private String department;
    private LocalDate startDate;
    private String notes;

    public Employee(Employee employee) {
        this.id = employee.id;
        this.fullName = employee.fullName;
        this.profilePic = employee.profilePic;
        this.gender = employee.gender;
        this.salary = employee.salary;
        this.department = employee.department;
        this.startDate = employee.startDate;
        this.notes = employee.notes;
    }

    public Employee(EmployeeDto employeeDto, int id) {
        this.fullName = employeeDto.getFullName();
        this.profilePic = employeeDto.getProfilePic();
        this.gender = employeeDto.getGender();
        this.salary = employeeDto.getSalary();
        this.department = employeeDto.getDepartment();
        this.startDate = employeeDto.getStartDate();
        this.notes = employeeDto.getNotes();
        this.id = id;
    }

    public Employee(EmployeeDto employeeDto) {
        this.fullName = employeeDto.getFullName();
        this.profilePic = employeeDto.getProfilePic();
        this.gender = employeeDto.getGender();
        this.salary = employeeDto.getSalary();
        this.department = employeeDto.getDepartment();
        this.startDate = employeeDto.getStartDate();
        this.notes = employeeDto.getNotes();
    }

}
