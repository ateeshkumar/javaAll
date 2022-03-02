package com.company;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
public class die {
    public static int getRandomValue(int Min, int Max)
    {
        return ThreadLocalRandom
                .current()
                .nextInt(Min, Max + 1);
    }
    public static void main(String[] args) {
        int Max = 6;
        int Min = 1;
        int i = getRandomValue(Min,Max);
        int j = getRandomValue(Min,Max);
        System.out.println(i);
        System.out.println(j);
        if (i!=j){
            System.out.println(i+j);
        }
        else {
            System.out.println(i+j+1);
        }
    }
}
