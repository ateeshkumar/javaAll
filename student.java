import java.io.Serializable;
import java.io.*;

class details implements Serializable {
    private static final long serialVersionUID = 1L;
    int id;
    String name;

    public details(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class student {
    public static void main(String args[]) {
        try {
            details s1 = new details(3779, "Ateesh kumar");
            FileOutputStream fout = new FileOutputStream("intro.txt");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(s1);
            out.close();
            System.out.println("Successfully Written To File!");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
