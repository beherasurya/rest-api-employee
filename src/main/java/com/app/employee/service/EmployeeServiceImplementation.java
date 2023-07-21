package com.app.employee.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.app.employee.model.Employee;

@Service
public class EmployeeServiceImplementation implements EmployeeService {

  private static List<Employee> employees= new ArrayList<>();
    static{
        Employee employee1 = new Employee();
        employee1.setName("Bhagban Parshuram");
        employee1.setAge(99);
        employee1.setDepartment("MBA");
        employee1.setEmail("bhagban@india.com");
        employee1.setLocation("INDIA");
        
        employees.add(employee1);

        Employee employee2 = new Employee();
        employee2.setName("Hari Narayan");
        employee2.setAge(19);
        employee2.setDepartment("DEVOPS");
        employee2.setEmail("harinarayan@india.com");
        employee2.setLocation("BHARAT");
        
        employees.add(employee2);



    }

    @Override
    public List<Employee> getEmployeeDetails() {

        return employees;
    }
    
}
