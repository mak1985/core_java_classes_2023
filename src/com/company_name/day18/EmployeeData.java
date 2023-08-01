package com.company_name.day18;

public class EmployeeData {

    //How to implement encapsulation (data hiding)
    /**
     * 1. private data variables : so that these variables cannot accessed directly from outside the class
     */

    private int ssn;

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    private String emp_name;
    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    private int emp_age;
    public int getEmp_age() {
        return emp_age;
    }

    public void setEmp_age(int emp_age) {
        this.emp_age = emp_age;
    }


    public static void main(String[] args) {
        EmployeeData obj = new EmployeeData();
        obj.setEmp_name("John");
        obj.setEmp_age(20);
        obj.setSsn(655555);

    }
}
