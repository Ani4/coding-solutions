import java.util.*;

/**
 * java
 */
public class java {
        static Scanner scan = new Scanner(System.in);

        public static void main(String[] args) {
                // write your code here
                int n = scan.nextInt();
                int arr[] = new int[n];
                for (int i = 0; i < arr.length; i++) {
                        arr[i] = scan.nextInt();
                }
                int max = Collection.max(arr);
                System.out.println(max);
        }
}