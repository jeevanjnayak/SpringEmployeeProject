package com.employee.employeeproject.entity;

import com.employee.employeeproject.dto.EmployeeDto;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@ToString
@RequiredArgsConstructor

@Entity
public class Employee {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String profilePic;
    private String gender;
    private int salary;
    @ElementCollection
    @CollectionTable(name = "department", joinColumns = @JoinColumn(name = "id"))
    @Column(name = "departments")
    private List<String> department;
    private String startDate;
    private String notes;

    public Employee(Employee employee) {
        this.id = employee.id;
        this.name = employee.name;
        this.profilePic = employee.profilePic;
        this.gender = employee.gender;
        this.salary = employee.salary;
        this.department = employee.department;
        this.startDate = employee.startDate;
        this.notes = employee.notes;
    }

    public Employee(EmployeeDto employeeDto, int id) {
        this.name = employeeDto.getName();
        this.profilePic = employeeDto.getProfilePic();
        this.gender = employeeDto.getGender();
        this.salary = employeeDto.getSalary();
        this.department = employeeDto.getDepartment();
        this.startDate = employeeDto.getStartDate();
        this.notes = employeeDto.getNotes();
        this.id = id;
    }

    public Employee(EmployeeDto employeeDto) {
        this.name = employeeDto.getName();
        this.profilePic = employeeDto.getProfilePic();
        this.gender = employeeDto.getGender();
        this.salary = employeeDto.getSalary();
        this.department = employeeDto.getDepartment();
        this.startDate = employeeDto.getStartDate();
        this.notes = employeeDto.getNotes();
    }

}
