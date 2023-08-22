package com.company_name.day28;

import java.util.PriorityQueue;

public class QueueInterfaceDemo {
    public static void main(String[] args) {

        //Create priorityQueue(c)
        PriorityQueue queue = new PriorityQueue();
        queue.add(10);//0th position
        queue.add(20);//1st position
        queue.add(30);//2nd position
        queue.add(40);//3rd position
        queue.add(50);//4th position
        queue.add(5);//5th position
        queue.add(100);//6th position
        System.out.println(queue);//[5, 20, 10, 40, 50, 30]

        System.out.println(queue);

        //offer(0 method
        queue.offer(100);
        System.out.println(queue);
        queue.clear();
        //accessing the data
//        System.out.println(queue.element());

        //peek()
        System.out.println(queue.peek());

    }
}
