package com.company_name.day27;

import java.util.LinkedList;

public class LinkedListSample1 {
    public static void main(String[] args) {

        //Declare LinkedList - collection 1
        LinkedList <String> list = new LinkedList<>();
        list.add("John");
        list.add("Paul");
        list.add("Sam");
        System.out.println(list);
        list.add("Rocky");
        System.out.println(list);

        //Collection 2
        LinkedList <String> list1 = new LinkedList<String>();
        list1.add("Tom");
        list1.add("Harry");
        list1.add("Peter");

        //Add collection list1 to the end of list collection
        list.addAll(list1);
        System.out.println("After adding collection2 to collection1 " + list);

        //Remove method
        list.remove("John");
        System.out.println("After removing John from collection " + list);

        list.remove(1);
        System.out.println("After removing Sam from collection " + list);

        //RemoveAll()
        list.removeAll(list1);
        System.out.println("After removing collection 2 from collection 1" + list);

        //get element of position
        System.out.println("Element at 1st position is :" + list.get(1));

        //set method -
        list.set(1, "Sam");
        System.out.println(list);
        list.add(0, "Coding");
        System.out.println(list);

    }
}
