package com.company;

import java.util.Scanner;

public class reversestring {
    public static void main(String[] args)throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string:");
        String s = sc.nextLine();
//        System.out.println(s);

        for (int k = (s.length()-1); k >=0; k--) {
            System.out.print(s.charAt(k));
        }
    }
}
