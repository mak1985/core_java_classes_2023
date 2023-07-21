package com.company_name.day12;

public class EmployeeData {
    //class variables
    int emp_id; //non-static
    String emp_designation;
    static String emp_department = "QA";

    EmployeeData(int empid, String empDesig){ //Parameterized constructor
        emp_id = empid;
        emp_designation = empDesig;
    }

    void display(){ //non-static method
        System.out.println(emp_id+ " "+ emp_designation + " " + emp_department);
    }

    //static method to change the value of emp_department
    static void changeRequest(){
        emp_department = "DevOps"; //static data member

    }

    public static void main(String[] args) {
        EmployeeData obj = new EmployeeData(100, "QA Lead");
        EmployeeData obj1 = new EmployeeData(100, "QA Manager");
        obj.display(); //100 QA Lead QA
        obj1.display(); //100 QA Manager QA

        changeRequest();
        System.out.println("After making the changes to DevOps");

        obj.display(); //100 QA Lead DevOps
        obj1.display(); //100 QA Manager DevOps

    }


}
