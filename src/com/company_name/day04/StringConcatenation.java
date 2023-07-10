package com.company_name.day04;

public class StringConcatenation {
    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "Java";

        //Hello Java
        System.out.println(str1 + str2 ); //HelloJava
        System.out.println(str1 + " " +str2 ); //Hello Java
        System.out.println("Custom msg :" + str1 + " " +str2); //Custom msg :Hello Java

    }
}
