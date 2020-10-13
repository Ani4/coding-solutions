import java.util.*;

/**
 * java
 */
public class java {
        static Scanner scan = new Scanner(System.in);

        public static void main(String[] args) {
                int n = scan.nextInt();
                int b1 = scan.nextInt();
                int b2 = scan.nextInt();

                System.out.println(convertN_B1toB2(n, b1, b2));
        }

        public static int convertN_B1toB2(int n, int b1, int b2) {
                return convertN_10tob2(convertN_b1to10(n, b1), b2);
        }

        public static int convertN_b1to10(int n, int b1) {
                int result = 0;
                int temp = 0;
                int count = 0;
                while (n > 0) {
                        temp = n % 10;
                        n /= 10;
                        result += Math.pow(b1, count) * temp;
                        count++;
                }
                // System.out.println(b1 + " -> 10 " + result);
                return result;
        }

        public static int convertN_10tob2(int n, int b2) {
                int result = 0;
                int temp = 0;
                int count = 1;
                while (n > 0) {
                        temp = n % b2;
                        n /= b2;
                        result += temp * count;
                        count *= 10;
                }
                // System.out.println("10 -> " + b2 + " " + result);
                return result;
        }
}