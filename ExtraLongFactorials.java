import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ExtraLongFactorials {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        BigInteger factorial = new BigInteger(String.valueOf(1));
        
        for (int i = 2; i <= N; ++i) {
            factorial = factorial.multiply(new BigInteger(String.valueOf(i)));
        }
        
        System.out.println(factorial);
    }
}