package com.company_name.day11;

public class EmpData {
    //class variables
    int id_card_no; // non-static variables
    static String companyName = "abc"; //static variable

    public static void main(String[] args) {
        EmpData emp1 = new EmpData();
        emp1.id_card_no = 12345;
        System.out.println(emp1.id_card_no + " "+ companyName);

        EmpData emp2 = new EmpData();
        emp2.id_card_no = 99660;
        System.out.println(emp2.id_card_no + " "+ companyName);


    }
}
