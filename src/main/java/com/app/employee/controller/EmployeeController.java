package com.app.employee.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.employee.model.Employee;
import com.app.employee.service.EmployeeService;

@RestController
public class EmployeeController {
    
    @Autowired
    EmployeeService employeeService;

    @GetMapping("/employee")
    public List<Employee>  getEmployeeDetails(){

        System.out.println("Employee Get  API is called");
        return employeeService.getEmployeeDetails();
    }

    @GetMapping("/employee/{id}")
    public Employee getEmployeeById(@PathVariable Long id){

        System.out.println( "Employee GETbyID API is called for "+id);
        return employeeService.getEmployeeById(id);
    }

    
    @PostMapping("/employee")
    public Employee saveEmployee(@Valid @RequestBody Employee employee){

        System.out.println("Employee Create API is called");
       return employeeService.saveEmployee(employee);
    }
    
    @DeleteMapping("/employee/{id}")
    public void deleteEmployeeById(@PathVariable Long id){

        System.out.println("Employee delete  API called for id :"+id);
        employeeService.deleteEmployeeById(id);
    }

    @PutMapping("/employee/{id}")
    public Employee updateEmployeeById(@PathVariable Long id, @RequestBody Employee employee){

        System.out.println("Employee  Update API called for ID : "+id ) ;
        employee.setId(id);
        return employeeService.updateEmployee(employee);
    }

}
