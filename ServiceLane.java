import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ServiceLane {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int T = scanner.nextInt();
        int[] width = new int[N];
        
        for (int i = 0; i < N; ++i) {
            width[i] = scanner.nextInt();
        }
        
        int[][] map = segmentWidthMap(width);
        
        while(T != 0) {
            int x = scanner.nextInt(), y = scanner.nextInt();
            
            if (map[0][x] > -1 && map[0][x] <= y)
                System.out.println(1);
            else if (map[1][x] > -1 && map[1][x] <= y)
                System.out.println(2);
            else if (map[2][x] > -1 && map[2][x] <= y)
                System.out.println(3);
                
            T -= 1;
        }
    }
    
    static int[][] segmentWidthMap(int[] width) {
        int N = width.length;
        int[][] map = new int[3][N];
        
        for (int i = 0; i < N; ++i) {
            map[0][i] = -1;
            map[1][i] = -1;
            map[2][i] = -1;
        }
        
        if (width[N - 1] == 3)
            map[2][N - 1] = N - 1;
        else if (width[N - 1] == 2)
            map[1][N - 1] = N - 1;
        else
            map[0][N - 1] = N - 1;
            
        for (int i = N - 2; i >= 0; --i) {
            map[2][i] = map[2][i + 1]; 
            map[1][i] = map[1][i + 1]; 
            map[0][i] = map[0][i + 1];
            map[width[i] - 1][i] = i;
        }
        
        return map;
    }
}