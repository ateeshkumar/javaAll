class A{
    void method(){
        System.out.println("employee ");
    }
}
class B extends A{
    void method2(){
        System.out.println("manager");
    }
}
interface C{
    void method3();
}
class D extends B implements C{
    @Override
    public void method3(){
        System.out.println("Woner");
    }

}
public class hybridinheritance {
    public static void main(String[] args) {
        D obj = new D();
        obj.method();
        obj.method2();
        obj.method3();
        
    }
    
}
