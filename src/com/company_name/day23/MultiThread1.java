package com.company_name.day23;


class Multithreading2 extends Thread {

    public void run ()
    {
        try {
            //Displaying the thread that is running
            System.out.println("Thread " + Thread.currentThread().getName() + " is running");
        }
        catch (Exception e) {
            System.out.println("Exception is caught");
        }
    }
}



public class MultiThread1 {
    public static void main(String[] args) {

        int n = 6; //Number of threads
        for (int i = 0; i < n; i++)
        {
            Multithreading2 obj = new Multithreading2();
            obj.start();
        }
    }
}
