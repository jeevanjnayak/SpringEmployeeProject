package com.employee.employeeproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class EmployeeProjectApplication {

    public static void main(String[] args) {

        SpringApplication.run(EmployeeProjectApplication.class, args);
        System.out.println("Hello Employee");
    }

}
