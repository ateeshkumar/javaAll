import java.lang.reflect.Method;

class Myclass{
    void method1(String a){
        System.out.println("Method 1 "+a);
    }
    void method2(String b){
        System.out.println("Method 1 "+b);
    }
    void method3(String c){
        System.out.println("Method 1 "+c);
    }
}
public class threemethod {
    public static void main(String[] args)throws Exception {
        
    
    Myclass o = new Myclass();
    Method m= Myclass.class.getDeclaredMethod("method", String.class );
    Object rv = m.invoke(null, "Coder");
    System.out.println("rv");
    }
    
}
