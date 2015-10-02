import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SimpleArraySum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfElements = scanner.nextInt();
        int sum = 0;
        
        for (int i = 0; i < numberOfElements; ++i) {
            sum += scanner.nextInt();
        }
        
        System.out.println(sum);
    }
}