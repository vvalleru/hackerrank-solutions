import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int d1 = 0, d2 = 0;

        for(int i = 0; i < N; ++i) {
            for (int j = 0; j < N; ++j) {
                int number = scanner.nextInt();
                
                if (i == j) d1 += number;
                if (j == N - i - 1) d2 += number;
            }
        }
        
        System.out.println(Math.abs(d1 - d2));
    }
}