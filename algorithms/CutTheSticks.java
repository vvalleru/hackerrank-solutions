import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CutTheSticks {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] sticks = new int[N];
        
        for (int i = 0; i < N; ++i) {
            sticks[i] = scanner.nextInt();
        }
        
        Arrays.sort(sticks);
        int cutLength = 0;
        
        for (int i = 0; i < N; ++i) {
            System.out.println(N - i);
            
            while (i + 1 < N && sticks[i] == sticks[i + 1])
                i += 1;
        }
    }
}