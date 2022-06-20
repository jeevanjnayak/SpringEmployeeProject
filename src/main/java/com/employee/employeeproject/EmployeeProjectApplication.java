package com.employee.employeeproject;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
@Slf4j
public class EmployeeProjectApplication {
    public static void main(String[] args) {

        SpringApplication.run(EmployeeProjectApplication.class, args);
        System.out.println("Hello Employee");
        log.info("hello");
    }

}
