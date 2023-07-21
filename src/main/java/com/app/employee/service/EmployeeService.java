package com.app.employee.service;

import java.util.List;

import com.app.employee.model.Employee;

public interface EmployeeService {
    
    List<Employee> getEmployeeDetails();

    Employee saveEmployee(Employee employee);

    Employee getEmployeeById(Long id);

    void deleteEmployeeById(Long id);
}
