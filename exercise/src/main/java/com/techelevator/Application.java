package com.techelevator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class Application {

    //create variable for departments
    List<Department> departments = new ArrayList<>();
    List<Employee> employees = new ArrayList<>();

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
        Employee employee1 = new Employee();
        employee1.setEmployeeId(1);
        employee1.setFirstName("Dean");
        employee1.setLastName("Johnson");
        employee1.setEmail("djohnson@teams.com");
        employee1.setSalary(60_000);
        employee1.setHireDate("08/21/2020");
        employee1.setDepartment(departments.get(getDepartmentIndex("Engineering")));

        Employee employee2 = new Employee(2, "Angie", "Smith", "asmith@teams.com", departments.get(getDepartmentIndex("Engineering")), "08/21/2020");




        Employee employee3 = new Employee(3, "Margaret", "Thompson", "mthompson@teams.com", departments.get(getDepartmentIndex("Marketing")), "08/21/2020");

        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);





    }

    // Method to find departments index based on the value EX: getDepartmentIndex("Engineering") >> 2
    private int getDepartmentIndex(String departmentName){
        for(int i = 0; i < departments.size(); i++){
            String department = departments.get(i).getName();
            if(department.equals(departmentName)){
                return i;
            }
        }
        return -1;
    }

    /**
     * Print out each employee in the collection.
     */
    private void printEmployees() {
        employees.get(1).raiseSalary(10);
        System.out.println("\n------------- EMPLOYEES ------------------------------");

        for(Employee employee: employees){
            System.out.println(employee.getLastName() + ", " + employee.getFirstName() + " " + employee.getEmail() + " " + employee.getSalary() + " " + employee.getDepartment().getName());
        }

    }

    /**
     * Create the 'TEams' project.
     */
    private void createTeamsProject() {
        Project newProject1 = new Project ("TEams", "Project Management Software", "10/10/2020", "11/10/2020");
        projects.put("TEams", newProject1);
        //list of enginnering employees
        List <Employee> enginneringTeam = new ArrayList<>();

        //read in all employees


        //if in enginnering, add to teamMembers on project

        //add project to project map


        for (Employee currentEmployee : employees) {
            //if in enginnering, add to teamMembers on project

            if ((currentEmployee.getDepartment().getName()).equalsIgnoreCase("Engineering")) {
                enginneringTeam.add(currentEmployee);
            }
            //set engineering team as team for project
            newProject1.setTeamMembers(enginneringTeam);

            //add project to project map
            projects.put("TEams", newProject1);
        }


    }

    /**
     * Create the 'Marketing Landing Page' project.
     */
    private void createLandingPageProject() {
            Project newProject2 = new Project ("Marketing Landing Page", "Lead Capture Landing Page for Marketing",
                    "10/10/2020", "10/17/2020");
            projects.put("Marketing Landing Page", newProject2);
            //list of marketing employees
            List <Employee> marketingTeam = new ArrayList<>();

            //read in all employees
            for (Employee currentEmployee : employees){
                //if in marketing, add to teamMembers on project

                if((currentEmployee.getDepartment().getName()).equalsIgnoreCase("Marketing")){
                    marketingTeam.add(currentEmployee);
                }
                //set marketing team as team for project
                newProject2.setTeamMembers(marketingTeam);

                //add project to project map
                projects.put("Marketing Landing Page", newProject2);
        }

    }

    /**
     * Print out each project in the collection.
     */
    private void printProjectsReport() {
        System.out.println("\n------------- PROJECTS ------------------------------");
        //loop through projects map
        for (Map.Entry <String, Project> entry : projects.entrySet()){
            String key = entry.getKey();
            Project value = entry.getValue();
            int numberOfEmployees = value.getTeamMembers().size();
                System.out.println(key + ": " + numberOfEmployees);

            }


    }

}
