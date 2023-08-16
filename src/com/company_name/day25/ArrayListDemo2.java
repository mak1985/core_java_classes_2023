package com.company_name.day25;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        //Declare arraylist(collection)
        //ArrayList <String> obj = new ArrayList<>();
        ArrayList obj = new ArrayList<>();
        obj.add("B");
        obj.add("A");
        obj.add("C");
        //obj.add(100);
        System.out.println(obj);
        //AddAll ()
        ArrayList <String> obj1 = new ArrayList<>();
        obj1.addAll(obj);
        System.out.println("After adding collection as obj to obj1 " + obj1); //[S, A, M]
        //removeAll()
        obj1.removeAll(obj);
        System.out.println("After removing collection "+ obj1);
        //How to use loop through elements of array list
        /**
         * for loop
         * for each (enhanched for loop
         * iterator
         */

//        for (int i = 0; i <obj.size(); i++) {
//            System.out.println(obj.get(i));
//        }

//        for (Object s : obj) {
//            System.out.println(s);
//        }

//        Iterator it = obj.iterator();
//        while (it.hasNext()) {
//            System.out.println(it.next());
//        }
//
        //How to sort arrayList using Collections class
        System.out.println("Before sorting " + obj); //B, A, C
        Collections.sort(obj);
        System.out.println("After sorting " + obj); //A, B, C
        //sorting arrayList in reverse order
        Collections.sort(obj, Collections.reverseOrder());
        System.out.println("After reverse order sorting " + obj); //C, B, A
        //shuffle()
        Collections.shuffle(obj);
        System.out.println("After shuffling " +obj); //A, C, B,
    }
}
