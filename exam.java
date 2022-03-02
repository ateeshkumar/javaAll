


public class exam {
    public static void main(String[] args) {
        int row= 4;
        // int arr[][]= new int[row][];
        int arr[][]= null;
        for (int i = 0; i < arr.length; i++) {
            arr[i]= new int[i+1];
        }
        int result = 1;
        for (int i = 3; i < row; ++i) {
            for (int j = 0; j < i+1; ++j) {
                arr[i][j]= j+1;
            }
        }
        for (int i = 3; i < row; ++i) {
            for (int j = 0; j < i+1; ++j) {
                result*= arr[i][j];
            }
        }
        System.out.println(result);
       
    }
    
}
