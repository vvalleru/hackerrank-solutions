import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SherlockAndTheBeast {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        
        while (T != 0) {
            int N = scanner.nextInt();
            int numOf5s = N;
            int numOf3s = 0;
            
            if (numOf5s % 3 == 0) {
                System.out.println(get5s(numOf5s));
                T -= 1;
                continue;
            }
            
            numOf3s += (numOf5s % 3);
            numOf5s -= (numOf5s % 3);
            
            while (numOf5s > 0 && numOf3s % 5 != 0) {
                numOf3s += 3;
                numOf5s -= 3;
            }
            
            if (numOf5s < 0 || (numOf3s % 5 != 0))
                System.out.println("-1");
            else
                System.out.println(get5s(numOf5s) + get3s(numOf3s));
            
            T -= 1;
        }
    }
    
    private static String get5s(int num) {
        StringBuilder numWith5s = new StringBuilder();
        
        while (num != 0) {
            numWith5s.append("5");
            num -= 1;
        }
        
        return numWith5s.toString();
    }
    
    private static String get3s(int num) {
        StringBuilder numWith3s = new StringBuilder();
        
        while (num != 0) {
            numWith3s.append("3");
            num -= 1;
        }
        
        return numWith3s.toString();
    }
}