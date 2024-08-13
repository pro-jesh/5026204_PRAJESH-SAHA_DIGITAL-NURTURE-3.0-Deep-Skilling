package com.example.EmployeeManagementSystem.repository;

import com.example.EmployeeManagementSystem.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
    @Query(name = "Department.findByName")
    Department findByName(@Param("name") String name);

}
