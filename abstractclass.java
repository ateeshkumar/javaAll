package com.company;
import java.util.*;
abstract class Book{
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
}

class MyBook extends Book{
    void setTitle(String s){
        title=s;
    }
}
public class Abstractclass {
    public static void main(String[] args) {
        //Book new_novel=new Book();  Abstract cass cannot be instantiated like this
        Scanner sc=new Scanner(System.in);
        String title=sc.nextLine();
        MyBook new_novel=new MyBook();
        new_novel.setTitle(title);
        System.out.println("The title is: "+new_novel.getTitle());


    }
}
