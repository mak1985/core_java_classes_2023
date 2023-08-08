package com.company_name.day23;

public class ThreadUsingInterface implements Runnable{


    @Override
    public void run() {
        System.out.println("Thread had completed");
    }


    public static void main(String[] args) {
        ThreadUsingInterface obj = new ThreadUsingInterface();
        Thread thread1 = new Thread(obj);
        thread1.start();
        System.out.println("Hello Thread");
    }
}
