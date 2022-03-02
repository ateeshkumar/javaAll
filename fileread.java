package com.company;
import java.io.FileReader;
public class fileread {
    public static void main(String[] args)throws Exception {
        int i = 0;
        FileReader fr = new FileReader("aateesh.txt");
        while ((i = fr.read()) != -1)
            System.out.print((char) i);
        fr.close();
    }
}
