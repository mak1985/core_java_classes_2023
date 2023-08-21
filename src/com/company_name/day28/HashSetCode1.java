package com.company_name.day28;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetCode1 {
    public static void main(String[] args) {
        //Declare HashSet
        HashSet <Integer> hs = new HashSet<>(); //homogenious only

        //Insert ele
        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(10);
        hs.add(null);
        hs.add(null);
        System.out.println(hs);

        //addAll method - Adding collection to another collection
        HashSet <Integer> cars = new HashSet<>();
        cars.add(100);
        cars.add(100);

        //Add cars collection to hs collection
        hs.addAll(cars);
        System.out.println(hs);//[null, 20, 100, 10, 30]

        HashSet<Object> hashSet = new HashSet<>(); //Hetrogenious data
        hashSet.add(10);
        hashSet.add("Java");
        System.out.println(hashSet);//[Java, 10]


        //Read elements from HashSet
        /**
         * 1. for each loop
         * 2. iterator
         */

        for (Object object: cars) {
            System.out.println(object);
        }

        for (Object object: hs) {
            System.out.println(object);
        }

        //Iterator method for reading
        Iterator it = hs.iterator();
        while (it.hasNext()) {
            System.out.println("/Iterator method for reading " + it.next());
        }


    }
}
