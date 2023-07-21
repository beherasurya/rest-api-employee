package com.app.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.employee.model.Employee;
import com.app.employee.service.EmployeeService;

@RestController
public class EmployeeController {
    
    @Autowired
    EmployeeService employeeService;

    @GetMapping("/api/employee")
    public List<Employee>  getEmployeeDetails(){

        System.out.println("Employee Details API is called");
        return employeeService.getEmployeeDetails();
    }

    @GetMapping("/api/employee/{id}")
    public String getEmployeeById(@PathVariable Long id){

        return "Employee details are displayed "+id;
    }

    @PostMapping("/api/employee")
    public String createEmployee(@RequestBody Employee employee){

        return "Employee Details Created :"+
                   "Name: " +employee.getName()+" "
                    +"AGE: "+employee.getAge()+" "
                    +"LOCATION: "+employee.getLocation()+" "
                   +"Department:" +employee.getDepartment()+" "
                   +"Email: " +employee.getEmail();
    }
    
    @DeleteMapping("/api/employee")
    public String deleteEmployeeById(@RequestParam Long id){

        return "Employee details are deleted for id :"+id;
    }

    @PutMapping("/api/employee/{id}")
    public Employee updateEmployeeById(@PathVariable Long id, @RequestBody Employee employee){

        System.out.println("Employee details are updated for ID : "+id ) ;

        return employee;
    }

}
