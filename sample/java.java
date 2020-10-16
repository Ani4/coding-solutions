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

                br.readLine(pw.write());
                pw.flush();
        }
}