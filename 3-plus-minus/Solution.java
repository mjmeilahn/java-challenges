import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // BEGIN challenge
    static void plusMinus(int[] arr) {
        int len = arr.length;
        int positives = 0;
        int negatives = 0;
        int zeroes = 0;
        NumberFormat formatter = new DecimalFormat("#0.000000");
        
        for (Integer i : arr) {
            if (i == 0) {
                zeroes++;
            } else if (i > 0 && i <= 100) {
                positives++;  
            } else if (i < 0 && i >= -100) {
                negatives++;
            }
        }
        
        if (positives > 0) {
            System.out.println(formatter.format((double) positives / len));
        } else {
            System.out.println(0);
        }
        
        if (negatives > 0) {
            System.out.println(formatter.format((double) negatives / len));
        } else {
            System.out.println(0);
        }
        
        if (zeroes > 0) {
            System.out.println(formatter.format((double) zeroes / len));
        } else {
            System.out.println(0);
        }
    }
    // END of challenge

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
