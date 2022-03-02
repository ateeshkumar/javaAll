package com.company;
import java.io.FileWriter;
public class filewrite {
    public static void main(String[] args)throws Exception {

        FileWriter fw = new FileWriter("aateesh.txt");
        String s = "this article complete for all of you for learning purpose";
        char ch[] = s.toCharArray();
        for (int i = 0; i < ch.length; i++)
            fw.write(ch[i]);
        fw.close();
    }
}
