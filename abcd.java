import java.io.*;
public class abcd {
    public static void main(String[] args)throws Exception {
        InputStream obj = new FileInputStream("inputoutput.java");
        System.out.print(obj.available());
    }
    
}
