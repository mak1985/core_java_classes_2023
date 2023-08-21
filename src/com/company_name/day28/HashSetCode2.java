package com.company_name.day28;

import java.util.HashSet;

public class HashSetCode2 {
    public static void main(String[] args) {
        HashSet <Integer> set1 = new HashSet<Integer>();
        set1.add(0);
        set1.add(2);
        set1.add(4);
        set1.add(6);
        set1.add(8);

        HashSet <Integer> set2 = new HashSet<Integer>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);

        //Union of two sets 1 & 2
        set2.addAll(set1);
        System.out.println("Union is " + set2);

        //Insertion - common elements from both the collections
        set2.retainAll(set1);
        System.out.println("Insertion is" + set2);

        //Difference of set1 and set2 (1-2)
        set1.removeAll(set2);
        System.out.println("Difference is" + set1);

    }
}
