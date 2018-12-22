import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // BEGIN Challenge
    static void staircase(int n) {
        if (n > 0) {
            String space = "";
            String str = "";
            
            for (int i = 1; i <= n; i++) {
                space = String.join("", Collections.nCopies(n - i, " "));
                str = (i > 1) ? String.join("", Collections.nCopies(i, "#")) : "#";
                System.out.println(space + str);
            }
        }
    }
    // END Challenge

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}
