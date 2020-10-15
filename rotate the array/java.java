import java.util.*;

/**
 * java
 */
public class java {
        static Scanner scan = new Scanner(System.in);

        public static void main(String[] args) {
                int size = scan.nextInt();
                int arr[] = new int[size];
                for (int i = 0; i < arr.length; i++) {
                        arr[i] = scan.nextInt();
                }
                int k = scan.nextInt();
                if (k > size)
                        k = k % size;
                reverse(arr, 0, arr.length - k);
                reverse(arr, arr.length - k, arr.length);
                reverse(arr, 0, 0);
                System.out.println(Arrays.toString(arr));
        }

        public static void reverse(int[] arr, int start, int end) {
                if (end == 0)
                        end = arr.length;
                end--;
                for (int i = start; end > i; i++, end--) {
                        int temp = arr[end];
                        arr[end] = arr[i];
                        arr[i] = temp;
                }
        }
}