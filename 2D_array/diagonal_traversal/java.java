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

                        }
                }

                for (int gap = 0; gap < arr.length; gap++) {
                        for (int i = 0, j = gap; j < arr.length; i++, j++) {

                                pw.println(arr[i][j]);

                        }
                }
                pw.flush();
                System.out.println(test_output());
                br.close();
                pw.close();

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
                        else if (line1 != line2) {
                                tr.close();
                                or.close();
                                return false;
                        }

                }
                tr.close();
                or.close();
                return true;

        }
}