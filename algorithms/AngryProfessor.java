import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AngryProfessor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        
        while (T != 0) {
            int N = scanner.nextInt(), K = scanner.nextInt(), studentsOnTime = 0;
            while (N != 0) {
                int student = scanner.nextInt();
                if (student <= 0)
                    studentsOnTime += 1;
                
                N -= 1;
            }
            if (studentsOnTime >= K)
                System.out.println("NO");
            else
                System.out.println("YES");
            
            T -= 1;
        }
    }
}