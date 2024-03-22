package com.techelevator;

public class Department {
    private int departmentId;
    private String name;

    //constructor
    public Department (int departmentId, String name){
        this.departmentId = departmentId;
        this.name = name;
    }
//getters
    public int getDepartmentId(){
        return departmentId;
    }

    public String getName(){
        return name;
    }
    //setters
public void setDepartmentId(int departmentId){
        this.departmentId = departmentId;
}
public void setName (String name){
        this.name = name;
}
}//end of class
