import java.util.Scanner;

public class stringCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while (i < 5) {
            System.out.println("Enter your name");
            String s = sc.nextLine();

            if (s.length() < 3) {
                throw new ArithmeticException("To short");
            } else {
                System.out.println("Valid");
            }
            i++;
        }

    }

}
