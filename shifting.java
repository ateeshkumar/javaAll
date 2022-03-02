package com.company;

import java.util.Scanner;

public class shifting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = sc.nextInt();
        if (num>0){
            System.out.println(num-1);
        }
        else {
            System.out.println(num+1);
        }
    }
}
