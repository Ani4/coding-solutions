import java.util.*;
import java.io.*;

/**
 * java
 */
public class java {
        static Scanner scan = new Scanner(System.in);

        public static void main(String[] args) throws Exception {
                String currentDirectory = System.getProperty("user.dir");

                BufferedReader br = new BufferedReader(new FileReader(currentDirectory + "/input.txt"));
                PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(currentDirectory + "/output.txt")));
                StringTokenizer st = new StringTokenizer(br.readLine());
                // Your code goes Here

                // write your code here
                int arr[][] = new int[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())];
                for (int i = 0; i < arr.length; i++) {
                        st = new StringTokenizer(br.readLine());
                        for (int j = 0; j < arr[0].length; j++) {

                                arr[i][j] = Integer.parseInt(st.nextToken());
                                // System.out.println(arr[i][j]);
                        }
                }
                int minr = 0, minc = 0, maxr = arr.length - 1, maxc = arr[0].length - 1;
                int count = 0;
                while (count < arr[0].length * arr.length) {
                        // left
                        for (int i = minr, j = minc; i <= maxr; i++) {
                                pw.println(arr[i][j]);
                                count++;
                        }
                        minc++;
                        // bottom
                        for (int i = maxr, j = minc; j <= maxc; j++) {
                                pw.println(arr[i][j]);
                                count++;

                        }
                        maxr--;

                        // right
                        for (int i = maxr, j = maxc; i >= minr; i--) {
                                pw.println(arr[i][j]);
                                count++;

                        }
                        maxc--;

                        // top
                        for (int i = minr, j = maxc; j >= minc; j--) {
                                pw.println(arr[i][j]);
                                count++;

                        }
                        minr++;

                }
                pw.flush();
                System.out.println(test_output());

        }

        public static boolean test_output() throws Exception {
                String currentDirectory = System.getProperty("user.dir");
                BufferedReader tr = new BufferedReader(new FileReader(currentDirectory + "/test.txt"));
                BufferedReader or = new BufferedReader(new FileReader(currentDirectory + "/output.txt"));
                while (true) {
                        String line1 = or.readLine();
                        String line2 = tr.readLine();
                        System.out.println(line1 + " _____" + line2);

                        if (line1 == null && line2 == null)
                                break;
                        else if (line1 != line2)
                                return false;

                }
                return true;
        }
}