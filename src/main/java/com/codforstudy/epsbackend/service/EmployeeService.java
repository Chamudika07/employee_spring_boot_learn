package com.codforstudy.epsbackend.service;

import com.codforstudy.epsbackend.dto.EmployeeDto;
import com.codforstudy.epsbackend.entity.Employee;

import java.util.List;

public interface EmployeeService {
    // add employee
    EmployeeDto createEmployee (EmployeeDto employeeDto);

    // get employee
    EmployeeDto getEmployeeById(Long employeeId);

    //Get ALl Employee
    List<EmployeeDto> getAllEmployees();

    //Update Employee
    EmployeeDto updateEmployee(Long employeeId , EmployeeDto updateEmployee);

    //Delete Employee
    void deletEmployee(Long employeeId);
}
