package com.employee.employeeproject.repository;

import com.employee.employeeproject.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Repository
public interface IEmployeeRepository extends JpaRepository<Employee, Integer> {
    @Query(value = "select * from department where department = engg",nativeQuery = true)
    List<Employee> findEmployeeByDepartment(@PathVariable String department);

}
