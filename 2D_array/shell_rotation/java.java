import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * java
 */
public class java {

        public static void main(String[] args) throws Exception {
                BufferedReader br = new BufferedReader(new FileReader("./input.txt"));
                PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("./output.txt")));
                pw.println("eelo");

                StringTokenizer st = new StringTokenizer(br.readLine());
                int[][] arr = new int[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())];
                for (int i = 0; i < arr.length; i++) {
                        st = new StringTokenizer(br.readLine());
                        for (int j = 0; j < arr[0].length; j++) {
                                arr[i][j] = Integer.parseInt(st.nextToken());
                        }
                }
                st = new StringTokenizer(br.readLine());
                int shell = Integer.parseInt(st.nextToken()), r = Integer.parseInt(st.nextToken());

                rotateShell(arr, shell, r);
                for (int i = 0; i < arr.length; i++) {
                        for (int j = 0; j < arr[0].length; j++) {
                                pw.println(arr[i][j] + " ");
                                System.out.print(arr[i][j] + " ");
                        }
                        pw.println();
                        System.out.println();
                }

        }

        public static void rotateShell(int[][] arr, int shell, int r) {
                int[] oneD = fillOneDformShell(arr, shell);
                rotateOneD(oneD, r);
                ShellfromOneD(arr, oneD, shell);
        }

        public static void ShellfromOneD(int[][] arr, int[] oneD, int shell) {
                int minr = shell - 1;
                int minc = shell - 1;
                int maxr = arr.length - shell;
                int maxc = arr[0].length - shell;

                int count = 0;
                for (int i = minr, j = minc; i <= maxr; i++) {

                        arr[i][j] = oneD[count];
                        count++;
                }

                for (int i = maxr, j = minc + 1; j <= maxc; j++) {
                        arr[i][j] = oneD[count];
                        count++;

                }

                for (int i = maxr - 1, j = maxc; i >= minr; i--) {
                        arr[i][j] = oneD[count];
                        count++;

                }

                for (int i = minr, j = maxc - 1; j >= minc + 1; j--) {
                        arr[i][j] = oneD[count];
                        count++;
                }

        }

        public static int[] fillOneDformShell(int[][] arr, int shell) {

                int minr = shell - 1;
                int minc = shell - 1;
                int maxr = arr.length - shell;
                int maxc = arr[0].length - shell;
                int size = 2 * (maxr - minr + maxc - minc);

                int[] oned = new int[size];
                int count = 0;
                for (int i = minr, j = minc; i <= maxr; i++) {
                        oned[count] = arr[i][j];
                        count++;
                }

                for (int i = maxr, j = minc + 1; j <= maxc; j++) {
                        oned[count] = arr[i][j];
                        count++;

                }

                for (int i = maxr - 1, j = maxc; i >= minr; i--) {
                        oned[count] = arr[i][j];
                        count++;

                }

                for (int i = minr, j = maxc - 1; j >= minc + 1; j--) {
                        oned[count] = arr[i][j];
                        count++;
                }

                return oned;
        }

        public static void rotateOneD(int[] arr, int r) {

                if (r < 0)
                        r = (r % arr.length) + arr.length;
                else
                        r = r % arr.length;
                reverse(arr, 0, arr.length - r);
                reverse(arr, arr.length - r, arr.length);
                reverse(arr, 0, arr.length);
        }

        public static void reverse(int[] arr, int s, int e) {
                for (int i = s, j = e - 1; i < j; i++, j--) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                }
        }

}