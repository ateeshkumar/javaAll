import java.io.*;
public class readfile {
    public static void main(String args[]) {
        try {
            FileInputStream fin = new FileInputStream("intro.txt");
            ObjectInputStream ois = new ObjectInputStream(fin);
            details s = (details) ois.readObject();
            System.out.println("\tUID: " + s.id + "\n\tName: " + s.name);
            ois.close();
            System.out.println("SuccessFully Read From the File!");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
