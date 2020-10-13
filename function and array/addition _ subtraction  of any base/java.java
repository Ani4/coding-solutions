import java.util.*;
import java.lang.*;

/**
 * java
 */
public class java {
        static Scanner scan = new Scanner(System.in);

        public static void main(String[] args) {

                int a = scan.nextInt();
                int b = scan.nextInt();
                int base = scan.nextInt();
                System.out.println(" Addition " + addition_any_base(a, b, base));
                if (b > a) {
                        System.out.println(" Subtraction " + subtraction_any_base(b, a, base));
                        return;
                }
                System.out.println(" Subtraction " + subtraction_any_base(a, b, base));
                System.out.println(" Multiplication " + multiplication_any_base(a, b, base));

        }

        public static int addition_any_base(int a, int b, int base) {
                int result = 0;
                int temp = 0;
                int count = 1;
                int carry = 0;
                while (a > 0 || b > 0 || carry > 0) {
                        temp = (a % 10) + (b % 10) + carry;
                        a /= 10;
                        b /= 10;
                        carry = temp / base;
                        result += (temp % 8) * count;
                        count *= 10;

                }

                return result;
        }

        public static int subtraction_any_base(int a, int b, int base) {
                int result = 0;
                int temp, tempa, tempb;
                int count = 1;
                int borrow = 0;
                while (a > 0) {
                        tempa = (a % 10) - borrow;
                        tempb = (b % 10);
                        a /= 10;
                        b /= 10;
                        if (tempb > tempa) {
                                borrow = 1;
                                tempa += base;
                        } else {
                                borrow = 0;

                        }

                        temp = tempa - tempb;
                        result += temp * count;
                        count *= 10;

                }

                return result;

        }

        public static int multiplication_any_base(int a, int b, int base) {
                int result = 0;
                int temp = 0;
                int count = 1;
                int carry = 0;
                while (b > 0) {
                        int dresult = 0;
                        int tempb = b % 10;
                        int dcount = 1;
                        while (a > 0) {
                                int tempa = (a % 10) + carry;
                                a /= 10;
                                temp = tempa * tempb;
                                dresult += (temp / base) * dcount;
                                carry = temp / base;
                                dcount *= 10;
                        }
                        b /= 10;
                        result = addition_any_base(result, dresult, base);
                        count *= 10;
                }
                return result;
        }
}