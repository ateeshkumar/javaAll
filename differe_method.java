package com.company;
class method{
    void method(){
        System.out.println("Simple method");
    }
    void method(int x){
        System.out.println("Your age is :"+x);
    }
    void method(int x, int y){
        System.out.println("First"+x+ "and Second is"+ y);
    }
}
public class differe_method {
    public static void main(String[] args) {
        method m = new method();
        m.method(19);
        m.method(4,6);
    }
}
