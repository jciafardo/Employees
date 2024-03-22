package com.techelevator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class Application {

    //create variable for departments
    List<Department> departments = new ArrayList<>();

    //create a variable for projects
    Map <String, Project> projects = new HashMap<>();


    /**
     * The main entry point in the application
     * @param args
     */
    public static void main(String[] args) {



        Application app = new Application();
        app.run();






    }//end of main

    private void run() {
        // create some departments
        createDepartments();

        // print each department by name
        printDepartments();

        // create employees
        createEmployees();

        // give Angie a 10% raise, she is doing a great job!

        // print all employees
        printEmployees();

        // create the TEams project
        createTeamsProject();
        // create the Marketing Landing Page Project
        createLandingPageProject();

        // print each project name and the total number of employees on the project
        printProjectsReport();
    }

    /**
     * Create departments and add them to the collection of departments
     */
    private void createDepartments() {

        departments.add(new Department(1, "Marketing"));
        departments.add(new Department(2, "Sales"));
        departments.add(new Department(3, "Engineering"));

    }

    /**
     * Print out each department in the collection.
     */
    private void printDepartments() {
        System.out.println("------------- DEPARTMENTS ------------------------------");
        for(Department currentDepartment: departments){
            System.out.println(currentDepartment.getName());
        }

    }

    /**
     * Create employees and add them to the collection of employees
     */
    private void createEmployees() {

    }

    /**
     * Print out each employee in the collection.
     */
    private void printEmployees() {
        System.out.println("\n------------- EMPLOYEES ------------------------------");

    }

    /**
     * Create the 'TEams' project.
     */
    private void createTeamsProject() {
        Project newProject1 = new Project ("TEams", "Project Management Software", "10/10/2020", "11/10/2020");
        projects.put("TEams", newProject1);

        //read in all employees
        for ()
        //if in enginnering, add to teamMembers on project

        //add project to project map


    }

    /**
     * Create the 'Marketing Landing Page' project.
     */
    private void createLandingPageProject() {

    }

    /**
     * Print out each project in the collection.
     */
    private void printProjectsReport() {
        System.out.println("\n------------- PROJECTS ------------------------------");

    }

}
