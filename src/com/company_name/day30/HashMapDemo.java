package com.company_name.day30;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {

        //HashMap hashMap = new HashMap();

        HashMap <Integer, String > hashMap1 = new HashMap<Integer, String>();
        hashMap1.put(100, "Tom");
        hashMap1.put(101, "Sam");
        hashMap1.put(102, "Tim");
        hashMap1.put(100, "Java");
        hashMap1.put(100, "JavaScript");
        hashMap1.put(103, "JavaScript");
        hashMap1.put(null, "C++");
        hashMap1.put(null, "C");
        hashMap1.put(105, null);
        hashMap1.put(106, null);
        hashMap1.put(107, null);

        System.out.println(hashMap1);

        //Fetch the element
        System.out.println(hashMap1.get(103)); //JavaScript

        //remove element
        System.out.println(hashMap1.remove(107));
        System.out.println(hashMap1);

        //containsKey(key)
        System.out.println(hashMap1.containsKey(107));

        //containsValue()
        System.out.println(hashMap1.containsValue("JavaScript"));

        //isEmpty()
        System.out.println(hashMap1.isEmpty());

        //keySet() - return all the keys present into HashMap
        System.out.println(hashMap1.keySet()); //[null, 100, 101, 102, 103, 105, 106]

        //values() - return all the values present into HashMap
        System.out.println(hashMap1.values()); //[C, JavaScript, Sam, Tim, JavaScript, null, null]

        //entrySet() - Return all the entries as set (key & value)
        System.out.println(hashMap1.entrySet()); // [null=C, 100=JavaScript, 101=Sam, 102=Tim, 103=JavaScript, 105=null, 106=null]

        //for each loop (enhanced for loop)
        for (Object o : hashMap1.keySet()) {
            System.out.println(o);
        }

        for (Object i : hashMap1.values()) {
            System.out.println(i);
        }

        for(Object obj : hashMap1.keySet()) {
            System.out.println(obj + " " +hashMap1.get(obj));//return key & value pair
        }

    }
}
