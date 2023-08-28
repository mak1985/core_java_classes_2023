package com.company_name.day31;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashTableDemo {
    public static void main(String[] args) {

        Hashtable hashtable = new Hashtable();

        Hashtable<String, String> hashtable1 = new Hashtable<>();
        hashtable1.put("emp_id", "01");
        hashtable1.put("emp_name", "John Peter");
        hashtable1.put("emp_designation", "QA Lead");
        hashtable1.put("emp_location", "India");

//        hashtable1.put("Null Value checking", null); //NullPointerException
//
//        hashtable1.put(null, "Null Value checking"); //NullPointerException

        System.out.println(hashtable1);

        System.out.println(hashtable1.get("emp_designation"));

        //Entry specific method
//        for (Map.Entry entry : hashtable1.entrySet()) {
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }

        //Iterator
        Set objSet = hashtable1.entrySet();
        Iterator it = objSet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            System.out.println(entry.getKey() + " " +entry.getValue());
        }



    }
}
