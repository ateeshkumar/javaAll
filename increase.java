package com.company;

import java.util.Scanner;

class check{
    int a, b, c;
    void order(){
        if (a<=b && b<=c){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }
}
public class increase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        check ch = new check();
        System.out.println("Enter your no: ");
        ch.a = sc.nextInt();
        ch.b = sc.nextInt();
        ch.c = sc.nextInt();
        ch.order();
    }
}
