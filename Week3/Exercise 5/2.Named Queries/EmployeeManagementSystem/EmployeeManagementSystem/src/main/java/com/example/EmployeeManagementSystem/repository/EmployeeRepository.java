package com.example.EmployeeManagementSystem.repository;

import com.example.EmployeeManagementSystem.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    List<Employee> findByDepartmentName(String departmentName);
    
    List<Employee> findByNameContaining(String name);

    @Query(value = "SELECT * FROM employees e WHERE e.name = ?1", nativeQuery = true)
    List<Employee> findEmployeesByNameNative(String name);
    @Query(name = "Employee.findByDepartmentName")
    List<Employee> findEmployeesByDepartmentName(@Param("departmentName") String departmentName);

    @Query(name = "Employee.findByEmail")
    Employee findByEmail(@Param("email") String email);

}
