package com.techelevator;

public class Employee {

    //instance variables
    private long employeeId;
    private String firstName;
    private String lastName;
    private String email;
    private double salary;
    private Department department;
    private String hireDate;
    private double START_SALARY = 60_000;


    // constructors

    public Employee(long employeeId, String firstName, String lastName, String email, Department department, String hireDate){
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.department = department;
        this.hireDate = hireDate;
    }

}
