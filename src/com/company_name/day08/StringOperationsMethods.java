package com.company_name.day08;

public class StringOperationsMethods {
    public static void main(String[] args) {

        String s = "Hello  Java";

        //startWith()
        String s1 = "Do you know me?";
//        System.out.println(s1.startsWith("Do"));

        //endWith()
//        System.out.println(s1.endsWith("me?"));

        //charAt() - Returns the character at the char specified index(position)
        //System.out.println(s.charAt(4));

        //length()
       // System.out.println(s.length());

        //toLowerCase()
        //System.out.println(s.toLowerCase()); //hello java

        //toUpperCase()
        //System.out.println(s.toUpperCase()); // HELLO JAVA

//        //replace()
//        //System.out.println(s.replace('J', 'T'));
//        System.out.println(s.replace("Tava", "JavaScript"));

        //indexOf()
//        System.out.println(s.indexOf('J'));

        //equals()
        String a = "Welcome";
        String b = "welcome";
        //System.out.println("Is a equals b? :" + a.equals(b));

        //equalsIgnoreCase()
        //System.out.println(a.equalsIgnoreCase(b));

        //Concatenates()
        String m1 = "Hellow World";
        String m2 = "World";
//        System.out.println(m1 + m2); //Hello World
//        System.out.println(m1.concat(m2));//Hello World
//        System.out.println(m1.concat("World"));//Hello World

        //contains()
       // System.out.println(m1.contains("d"));

        //isEmpty()
        m1 = "";
        //System.out.println(m1.isEmpty());

        //substring()
//        String c = "WELCOMEE to my place";
//        System.out.println(c.substring(3, 8)); //COME
//        System.out.println(c.substring(3)); //COMEE to my place


        //trim()
        String d = " My City is good ";
        System.out.println(d.trim());
    }
}
