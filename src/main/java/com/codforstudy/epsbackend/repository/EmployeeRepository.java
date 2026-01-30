package com.codforstudy.epsbackend.repository;

import com.codforstudy.epsbackend.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee , Long> {

}
