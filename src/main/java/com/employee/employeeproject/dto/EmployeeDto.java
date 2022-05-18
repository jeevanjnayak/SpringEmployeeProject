package com.employee.employeeproject.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.time.LocalDate;

@Data
@RequiredArgsConstructor
public class EmployeeDto {

    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]+$", message = "Name is invalid! it must have atleast 2 characters and the first character should be uppercase.")
    private String fullName;

    @NotEmpty(message = "Profile pic can't be empty")
    private String profilePic;

    @NotEmpty(message = "Its a required field! can't be empty")
    private String gender;

    @Min(value = 15000, message = "salary can't be less than 15000!")
    private int salary;

    @NotNull(message = "Mention the Department!")
    private String department;

    @NotNull(message = "Mention the Start Date!")
    private LocalDate startDate;
    private String notes;
}
