import java.util.*;

/**
 * java
 */
public class java {
        static Scanner scan = new Scanner(System.in);

        public static void main(String[] args) {
                int arr[] = new int[scan.nextInt()];
                for (int i = 0; i < arr.length; i++) {
                        arr[i] = scan.nextInt();

                }
                int td = scan.nextInt();
                int lo = 0, hi = arr.length - 1, mid = (lo + hi) / 2;

                while (lo <= hi && arr[mid] != td) {
                        if (arr[mid] < arr[hi]) {
                                hi = mid - 1;

                        } else if (arr[mid] > arr[lo]) {
                                lo = mid + 1;
                        }
                        mid = (lo + hi) / 2;
                }
                System.out.println(arr[mid] + " found at " + mid);
        }
}