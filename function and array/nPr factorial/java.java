import java.util.*;
import java.lang.*;

/**
 * java
 */
public class java {
        static Scanner scan = new Scanner(System.in);

        public static void main(String[] args) {
                int n = scan.nextInt();
                int r = scan.nextInt();
                while (r > n) {
                        System.out.println("pls enter the smaller value than" + n);
                        r = scan.nextInt();
                }
                System.out.println(npr(n, r));
                scan.close();

        }

        public static float npr(int n, int r) {
                // n!
                // -----
                // (n-r)!
                return fact(n) / fact(n - r);
        }

        public static float fact(int i) {
                if (i < 2)
                        return 1;
                return i * fact(i - 1);
        }

}