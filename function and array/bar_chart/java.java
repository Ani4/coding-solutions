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
                int max = find_max(arr);
                for (int floor = max; floor > 0; floor--) {
                        for (int i : arr) {
                                if (floor <= i)
                                        System.out.print("@");
                                else
                                        System.out.print(" ");
                        }
                        System.out.println();

                }

        }

        public static int find_max(int[] arr) {
                int max = Integer.MIN_VALUE;
                for (int i : arr) {
                        if (i > max) {
                                max = i;
                        }
                }
                return max;
        }
}