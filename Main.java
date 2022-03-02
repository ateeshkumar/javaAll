package com.company;

public class Main {

    public static void main(String[] args) {
        try{
            int sum;
            sum = 10;
            for (int j = -1; j <3 ; ++j) {
                sum = (sum/j);
            }
        }
        catch (ArithmeticException e){
            System.out.println(0);
        }
//        System.out.println(sum);
    }
}
