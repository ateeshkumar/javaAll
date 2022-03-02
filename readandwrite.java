package com.company;
import java.io.FileReader;
import java.io.FileWriter;
public class readandwrite {
    public static void main(String[] args)throws Exception {
        FileWriter fo = new FileWriter("ateesh.txt");
        String str = "Ateesh is a good boy.";
        for (int i = 0; i <str.length() ; i++) {
            fo.write(str.charAt(i));
        }
        System.out.println("Successful");
        fo.close();
        FileReader fr = new FileReader("ateesh.txt");
        int i;
        while ((i=fr.read())!=-1){
            System.out.print((char)i);
        }
        fr.close();
    }
}
