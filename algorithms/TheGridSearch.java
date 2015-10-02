import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TheGridSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        
        while (T != 0) {
            int R = scanner.nextInt(), C = scanner.nextInt();
            char[][] grid = new char[R][C];
            
            for (int i = 0; i < R; ++i) {
                String row = scanner.next();
                for (int j = 0; j < C; ++j) {
                    grid[i][j] = row.charAt(j);
                }
            }
            
            int r = scanner.nextInt(), c = scanner.nextInt();
            char[][] pattern = new char[r][c];
            
            for (int i = 0; i < r; ++i) {
                String row = scanner.next();
                for (int j = 0; j < c; ++j) {
                    pattern[i][j] = row.charAt(j);
                }
            }
            
            boolean matchFound = false;            
            for (int i = 0; i <= R - r; ++i) {
                for (int j = 0; j <= C - c; ++j) {
                    if (match(grid, i, j, pattern)) {
                        System.out.println("YES");
                        matchFound = true;
                        break;
                    }
                }
                if (matchFound) break;
            }
            
            if (!matchFound)
                System.out.println("NO");
            
            T -= 1;
        }
    }
    
    private static boolean match(char[][] grid, int row, int col, char[][] pattern) {
        for (int i = 0; i < pattern.length; ++i) {
            for (int j = 0; j < pattern[0].length; ++j) {
                if (grid[row + i][col + j] != pattern[i][j])
                    return false;
            }
        }
        
        return true;
    }
}