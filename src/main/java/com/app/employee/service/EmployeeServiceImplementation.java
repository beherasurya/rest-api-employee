package com.app.employee.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.employee.model.Employee;
import com.app.employee.repository.EmployeeRepoitory;

@Service
public class EmployeeServiceImplementation implements EmployeeService {

//   private static List<Employee> employees= new ArrayList<>();
    
    @Autowired
    EmployeeRepoitory employeeRepoitory;
    @Override
    public List<Employee> getEmployeeDetails() {

        return employeeRepoitory.findAll();
    }

    public Employee saveEmployee(Employee employee){

        return employeeRepoitory.save(employee);
    }
    
}
