package com.app.employee.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Employee {
    
    private String id;
    private String name;
    private String department;
    private String email;
}
