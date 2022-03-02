package com.company;
class mythread1 extends Thread{
    public void run(){
        int i= 0;
        while (i<200){
            System.out.println("girlfrined chatting");
            i++;
        }
    }
}
class mythread2 extends Thread{

    public void run(){
        int i = 0;
        while (i<200){
            System.out.println("cooking");
            i++;
        }
    }
}
public class threadinjava {
    public static void main(String[] args) {
        mythread1 m1 = new mythread1();
        mythread2 m2 = new mythread2();
        m1.start();
        m2.start();
    }
}
