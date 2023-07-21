package com.app.employee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.employee.model.Employee;
import com.app.employee.repository.EmployeeRepoitory;

@Service
public class EmployeeServiceImplementation implements EmployeeService {

//   private static List<Employee> employees= new ArrayList<>();
    
    @Autowired
    EmployeeRepoitory employeeRepository;
    @Override
    public List<Employee> getEmployeeDetails() {

        return employeeRepository.findAll();
    }

    public Employee saveEmployee(Employee employee){

        return employeeRepository.save(employee);
    }

    @Override
    public Employee getEmployeeById(Long id) {

        Optional<Employee> employee = employeeRepository.findById(id);
        if(employee.isPresent())
        {
            return employee.get();
        }
        throw new RuntimeException("Employee Details Not Found for ID: "+id);
        
    }
    
}
