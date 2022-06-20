package com.employee.employeeproject.repository;

import com.employee.employeeproject.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface IEmployeeRepository extends JpaRepository<Employee, Integer> {
    @Query(value = "SELECT * FROM employee e, department ed WHERE e.id = ed.id AND ed.departments = :department",nativeQuery = true)
    List<Employee> findEmployeeByDepartment(String department);

}
