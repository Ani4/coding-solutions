import java.util.*;

import java.io.*;

/**
 * java
 */

public class java {
        static Scanner scan = new Scanner(System.in);

        public static void main(String[] args) throws Exception {
                // write your code here
                BufferedReader br = new BufferedReader(new FileReader("input.txt"));

                // PrintWriter class prints formatted representations
                // of objects to a text-output stream.
                PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));

                // Your code goes Here
                int n = Integer.parseInt(br.readLine());
                int i = Integer.parseInt(br.readLine());
                int j = Integer.parseInt(br.readLine());
                int k = Integer.parseInt(br.readLine());
                int m = Integer.parseInt(br.readLine());

                int onMask = (1 << i);
                int ofMask = ~(1 << j);
                int toggle = (1 << k);
                int check = (1 << m);

                pw.println((n | onMask));
                pw.println((n & ofMask));
                pw.println((n ^ toggle));
                pw.println((n & onMask) == 0 ? false : true);

                // br.readLine(pw.write());
                pw.flush();
        }
}