class parent{
    parent(){
        System.out.println("Constructor method");
    }
    void yoyo(){
        System.out.println("Overriding method");
    }
}
class child extends parent{
    @Override
    void yoyo(){
        System.out.println("Override from parent class");
    }
}
public class inheritence {
    public static void main(String[] args) {
        child c = new child();
        c.yoyo();
    }
}
