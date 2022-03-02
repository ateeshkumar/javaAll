package com.company;

import java.util.Scanner;

public class throwkyword {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        try {
            if(age<18){
                throw new ArithmeticException("You are't able to give vote");
            }
            else {
                System.out.println("You can give vote");
            }
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
    }
}
