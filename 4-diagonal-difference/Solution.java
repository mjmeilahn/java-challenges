import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.lang.*;
import org.apache.commons.lang3.ArrayUtils;

public class Solution {

    // BEGIN challenge
    static int diagonalDifference(int[][] arr) {
        int i = 0;
        List<Integer> left = new ArrayList();
        List<Integer> right = new ArrayList();

        // ADD LEFT DIAGONAL VALUES
        for (int[] child : arr) {
            left.add(child[i]);
            i++;
        }

        int Ltotal = left.stream().mapToInt(Integer::intValue).sum();

        // RESET COUNTER
        i = 0;

        // REVERSE ARRAY
        ArrayUtils.reverse(arr);

        // ADD RIGHT DIAGONAL VALUES
        for (int[] child : arr) {
            right.add(child[i]);
            i++;
        }

        int Rtotal = right.stream().mapToInt(Integer::intValue).sum();

        // RETURN TOTAL
        return Math.abs(Ltotal - Rtotal);
    }
    // END challenge

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < n; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = diagonalDifference(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
