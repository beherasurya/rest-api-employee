package com.app.employee.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Employee {
    
    private String name;
    private int age;
    private String location;
    private String department;
    @JsonIgnore
    private String email;
}
