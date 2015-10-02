import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CavityMap {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        char[][] map = new char[N][N];
        
        for (int i = 0; i < N; ++i) {
            String row = scanner.next();
            for (int j = 0; j < N; ++j) {
                map[i][j] = row.charAt(j);
            }
        }
        
        for (int i = 0; i < N; ++i) {
            for (int j = 0; j < N; ++j) {
                char ch;
                if (i == 0 || i == N - 1 || j == 0 || j == N - 1)
                    ch = map[i][j];
                else if (map[i - 1][j] == 'X' || map[i + 1][j] == 'X' || 
                         map[i][j - 1] == 'X' || map[i][j + 1] == 'X' )
                    ch = map[i][j];
                else if (map[i][j] <= map[i - 1][j] || map[i][j] <= map[i + 1][j] || 
                        map[i][j] <= map[i][j - 1] || map[i][j] <= map[i][j + 1])
                    ch = map[i][j];
                else
                    ch = 'X';
                System.out.print(ch);
                map[i][j] = ch;
            }
            System.out.println();
        }
    }
}