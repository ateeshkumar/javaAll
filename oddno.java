import java.util.Scanner;
public class oddno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your odd number: ");
        // int A = sc.nextInt();
        int A = 9;
        for (int i = 1; i <= A; i++) {
            if( i%2!= 0){
                System.out.print(i+" ");
            }
        }
    }
    
}
