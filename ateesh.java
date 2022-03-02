class first{
    void display(){
        System.out.println("inside first");
    }
}
class second extends first{
    void display(){
        System.out.println("inside first");
    }
}
public class ateesh {
    public static void main(String[] args) {
        first ob = new first();
        second sc = new second();
        first ref;
        ref = ob;
        ref.display();
        ref = sc;
        ref.display();

    }
    
}
