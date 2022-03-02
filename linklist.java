package com.company;

import java.util.LinkedList;

class MyStack{
    private LinkedList l = new LinkedList();
    public void push1(Object o){
        l.addFirst(o);
    }
    public  void push2(Object obj){
        l.addLast(obj);
    }
    public  void bottom() {
        return ;

    }
    public void pop(){
//        return l.removeFirst();
    }

}
public class linklist {
    public static void main(String[] args) {

    }
}
