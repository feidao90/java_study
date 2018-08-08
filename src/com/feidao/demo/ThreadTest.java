package com.feidao.demo;

class MyThread extends Thread{
    public void run(){
        System.out.println("test-my-thread");
    }
}

public class ThreadTest extends Thread {
    private MyThread threadVar;

     public void run(){
        for (int a = 0; a < 50; a ++)
            System.out.println(a);
    }

    public static void main(String args[]){
        ThreadTest myThread = new ThreadTest();
        myThread.start();

        ThreadTest oneThread = new ThreadTest();
        oneThread.start();

        myThread.threadVar.run();
    }
}

