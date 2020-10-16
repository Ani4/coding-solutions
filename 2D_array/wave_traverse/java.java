import java.util.*;

/**
 * java
 */
public class java {
        static Scanner scan = new Scanner(System.in);

        public static void main(String[] args) {
                // write your code here
                int arr[][] = new int[scan.nextInt()][scan.nextInt()];
                for (int i = 0; i < arr.length; i++) {
                        for (int j = 0; j < arr[0].length; j++) {
                                arr[i][j] = scan.nextInt();
                        }
                }
                for (int i = 0; i < arr[0].length; i++) {
                        if (i % 2 == 0)
                                for (int j = 0; j < arr.length; j++) {
                                        System.out.println(arr[j][i]);
                                }
                        else {
                                for (int j = arr.length - 1; j >= 0; j--) {
                                        System.out.println(arr[j][i]);
                                }
                        }
                }
        }
}