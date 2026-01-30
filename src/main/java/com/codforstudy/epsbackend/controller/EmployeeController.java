package com.codforstudy.epsbackend.controller;

import com.codforstudy.epsbackend.dto.EmployeeDto;
import com.codforstudy.epsbackend.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/employees")

public class EmployeeController {
    private EmployeeService employeeService;

    //Build Add Employee REST API
    @PostMapping
    public ResponseEntity<EmployeeDto> createEmployee(@RequestBody EmployeeDto employeeDto){
        EmployeeDto saveEmployee = employeeService.createEmployee(employeeDto);
        return new ResponseEntity<>(saveEmployee , HttpStatus.CREATED);
    }

    // Build Get Employee Rest API
    @GetMapping("{id}")
    public ResponseEntity<EmployeeDto> getEmployeeById(@PathVariable("id") Long employeeId){
        EmployeeDto employeeDto = employeeService.getEmployeeById(employeeId);
        return ResponseEntity.ok(employeeDto);

    }

    // Build GEt ALL Method
    @GetMapping
    public ResponseEntity<List<EmployeeDto>> getAllEmployees(){
        List<EmployeeDto> employees = employeeService.getAllEmployees();
        return ResponseEntity.ok(employees);
    }

    // Build Update Employee API
    @PutMapping("{id}")
    public ResponseEntity<EmployeeDto>updateEmployee(@PathVariable("id") Long employeeId,
                                                     @RequestBody EmployeeDto updateEmployee){

        EmployeeDto employeeDto = employeeService.updateEmployee(employeeId , updateEmployee);
        return ResponseEntity.ok(employeeDto);
    }

    //Build Delete Employee API
    @DeleteMapping("{id}")
    public ResponseEntity<String> deletEmployee(@PathVariable("id") Long employeeId){
        employeeService.deletEmployee(employeeId);

        return ResponseEntity.ok("Employee deleted successfully");
    }



}
