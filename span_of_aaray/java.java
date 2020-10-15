import java.util.*;

/**
 * java
 */
public class java {
        static Scanner scan = new Scanner(System.in);

        public static void main(String[] args) {
                // write your code here
                int a = scan.nextInt();
                int c[] = new int[a];
                for (int i = 0; i < c.length; i++) {
                        c[i] = scan.nextInt();

                }
                int min = c[0], max = c[0];
                for (int i : c) {
                        if (max < i) {
                                max = i;
                        } else if (min > i) {
                                min = i;
                        }

                }
                System.out.println(max - min);
        }
}