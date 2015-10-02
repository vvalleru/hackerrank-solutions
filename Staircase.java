import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Staircase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
        for (int i = 0; i < N; ++i) {
            for (int j = 0; j < N; ++j) {
                if (j >= N - i - 1)
                    System.out.print('#');
                else
                    System.out.print(' ');
            }
            System.out.println();
        }
    }
}