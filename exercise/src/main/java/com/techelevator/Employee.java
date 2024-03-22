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
        this.salary = START_SALARY;
    }

    public Employee(){

    }

    // getters

    public long getEmployeeId(){
        return employeeId;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }

    public String getEmail(){
        return email;
    }
    public double getSalary(){
        return salary;
    }
    public Department getDepartment(){
        return department;
    }
    public String getHireDate(){
        return hireDate;
    }

    // setters

    public void setEmployeeId(long employeeId){
        this.employeeId = employeeId;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }

    public void setDepartment(Department department){
        this.department = department;
    }
    public void setHireDate(String hireDate){
        this.hireDate = hireDate;
    }


     // use case methods
    public String getFullName(){
        String fullName = lastName + ", " + firstName;
        return fullName;
    }

    public void raiseSalary(double percent){
        double raise = (percent / 100) * salary;
        salary += raise;
    }





}
