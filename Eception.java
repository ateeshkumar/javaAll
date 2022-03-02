package com.company;
public class Eception {
    public static void main(String[] args) {
        int arr[] = new int[3];
        arr[0]= 1;
        arr [1]= 2;
        arr [2]= 4;
        try {
            System.out.println(arr[4]);
            System.out.println(arr[2]/0);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
    }
}
