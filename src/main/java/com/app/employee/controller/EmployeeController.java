package com.app.employee.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.employee.model.Employee;

@RestController
public class EmployeeController {
    
    

    @GetMapping("/api/employee")
    public String getEmployeeDetails(){

        return "Employee Details API is called";
    }

    @GetMapping("/api/employee/{id}")
    public String getEmployeeById(@PathVariable Long id){

        return "Employee details are displayed "+id;
    }

    @PostMapping("/api/employee")
    public String createEmployee(@RequestBody Employee employee){

        return "Employee Details Created :"+
                   "Name: " +employee.getName()+" "
                    +"ID: "+employee.getId()+" "
                   +"Department:" +employee.getDepartment()+" "
                   +"Email: " +employee.getEmail();
    }
    
    @DeleteMapping("/api/employee")
    public String deleteEmployeeById(@RequestParam Long id){

        return "Employee details are deleted for id :"+id;
    }

    @PutMapping("/api/employee/{id}")
    public String updateEmployeeById(@PathVariable Long id, @RequestBody Employee employee){

        return "Employee details are updated for ID : "+id +" "+employee;
    }

}
