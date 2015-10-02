import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FindDigits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        
        while (T != 0) {
            int N = scanner.nextInt();
            int curr = N;
            int result = 0;
            
            while (curr != 0) {
                int divisor = curr % 10;
                curr /= 10;
                if (divisor == 0) continue;
                if (N % divisor == 0) result += 1;
            }
            
            System.out.println(result);
            
            T -= 1;
        }
    }
}