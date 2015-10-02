import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class UtopianTree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        
        while (T != 0) {
            int N = scanner.nextInt();
            int height = 1;
            
            while (N > 0) {
                height *= 2;
                N -= 1;
                
                if (N > 0) {
                    height += 1;
                    N -= 1;
                }
            }
            
            System.out.println(height);
            
            T -= 1;
        }
    }
}