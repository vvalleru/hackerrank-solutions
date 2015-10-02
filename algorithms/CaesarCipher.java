import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CaesarCipher {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        String s = scanner.next();        
        int K = scanner.nextInt();
        
        K %= 26;
        for (int i = 0; i < length; ++i) {
            System.out.print(encrypt(s.charAt(i), K));
        }
    }
    
    private static char encrypt(char ch, int K) {
        if (Character.isAlphabetic(ch)) {
            if(Character.isLowerCase(ch)) {
                ch = ((int)ch + K > (int)'z') ? (char)((int)ch + K - 26) : (char)((int)ch + K);
            } else {
                ch = ((int)ch + K > (int)'Z') ? (char)((int)ch + K - 26) : (char)((int)ch + K);
            }
        }
        
        return ch;
    }
}