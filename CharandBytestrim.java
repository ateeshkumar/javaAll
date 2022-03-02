package com.company;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CharandBytestrim {
    public static void main(String[] args)throws Exception {

        FileOutputStream fo = new FileOutputStream("text.txt");
        FileInputStream fi = new FileInputStream("text.txt");
        int temp;
        while ((temp= fi.read())!=-1){
            System.out.print((byte)temp);
        }
        fo.close();
        fi.close();
    }
}
