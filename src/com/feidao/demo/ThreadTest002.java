package com.feidao.demo;

public class ThreadTest002 extends Thread {
    private int a = 0;

    public void run(){
        for (int i = 0; i < 50; i ++)
            System.out.println(i);
            System.out.println(currentThread().getName()+":"+a);
            try {
                sleep(100);
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
    }

    public static void main(String args[]){
        ThreadTest002 thread002 = new ThreadTest002();
        ThreadTest002 machine2 = new ThreadTest002();
        thread002.start();
        machine2.start();
        thread002.run();
    }
}
