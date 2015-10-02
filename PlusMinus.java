import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PlusMinus {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        double positive = 0;
        double negative = 0;
        double zero = 0;
        
        for (int i = 0; i < N; ++i) {
            int number = scanner.nextInt();
            if (number > 0)  positive += 1;
            else if (number == 0) zero += 1;
            else negative += 1;
        }
        
        positive /= N;
        negative /= N;
        zero /= N;
        
        System.out.println(new DecimalFormat("0.000000").format(positive));
        System.out.println(new DecimalFormat("0.000000").format(negative));
        System.out.println(new DecimalFormat("0.000000").format(zero));

    }
}