import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ChocolateFeast {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i++){
            System.out.println(Solve(in.nextInt(), in.nextInt(), in.nextInt()));
        }
    }
    
    private static long Solve(int N, int C, int M){
        int chocolates = 0, wrappers = 0;
        
        while ((N / C) > 0 || (wrappers / M) > 0) {
            chocolates += (N / C);
            wrappers += (N / C);
            int bonusChocolates = (wrappers / M);
            chocolates += bonusChocolates;
            
            N %= C;
            wrappers %= M;
            wrappers += bonusChocolates;
        }
        
        return chocolates;
    }
}