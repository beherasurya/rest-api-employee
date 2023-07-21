package com.app.employee.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name = "tbl_employee")
public class Employee {
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    @NotNull(message  ="Name Should not be Null")
    private String name;

    @Column
    private int age;
    @Column
    private String location;

    @Column
    @NotNull(message  ="Department Should not be Null")
    private String department;
    @Column
    // @JsonIgnore
    @Email(message  ="Provide Valid Email ID")
    private String email;
}
