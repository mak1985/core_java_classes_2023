package com.company_name.day29;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetCode1 {
    public static void main(String[] args) {
        //Create a linkedHashSet

        LinkedHashSet <Integer> linkedHashSet = new LinkedHashSet<>(); //homogeneous data type

        LinkedHashSet linkedHashSet1 = new LinkedHashSet(); //heterogeneous

        linkedHashSet1.add(1);
        linkedHashSet1.add(2);
        linkedHashSet1.add(3);
        linkedHashSet1.add(4);
        linkedHashSet1.add(5);

        System.out.println(linkedHashSet1); //Maintained insertion order

        HashSet hashSet1 = new HashSet();
        hashSet1.add(10);
        hashSet1.add(20);
        hashSet1.add(30);
        hashSet1.add(40);
        hashSet1.add(50);
        System.out.println(hashSet1);//NOT Maintained insertion order

        /**
         * Note: LinkedHashSet is slower compare to HashSet due to insertion order maintained
         *
         */
    }
}
