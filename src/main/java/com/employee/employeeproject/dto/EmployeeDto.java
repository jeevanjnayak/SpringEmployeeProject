package com.employee.employeeproject.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.JoinColumn;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.List;

@Data
@RequiredArgsConstructor
public class EmployeeDto {

    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]+$", message = "Name is invalid! it must have atleast 2 characters and the first character should be uppercase.")
    private String name;

    @NotEmpty(message = "Profile pic can't be empty")
    private String profilePic;

    @NotEmpty(message = "Its a required field! can't be empty")
    private String gender;

    @Min(value = 15000, message = "salary can't be less than 15000!")
    private int salary;

    @ElementCollection
    @CollectionTable(name = "department", joinColumns = @JoinColumn(name = "id"))
    @Column(name = "departments")
    private List<String> department;

    @NotNull(message = "Mention the Start Date!")
    private String startDate;
    private String notes;
}
