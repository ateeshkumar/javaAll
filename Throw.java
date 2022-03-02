
import java.util.Scanner;

public class Throw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int a = sc.nextInt();
        System.out.println(a);
        if (a<18){
            throw new ArithmeticException ("This is not eligible for vote");

        }
        else {
            System.out.println("Persion is eligible for vote!");
        }
    }
}
