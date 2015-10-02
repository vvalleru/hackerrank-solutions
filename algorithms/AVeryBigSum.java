import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AVeryBigSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        long sum = 0;
        
        for (int i = 0; i < N; ++i) {
            sum += scanner.nextInt();
        }
        
        System.out.println(sum);
    }
}