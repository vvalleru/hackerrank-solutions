import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SherlockAndSquares {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int T = scanner.nextInt();
    
    while (T != 0) {
      int x = scanner.nextInt(), y = scanner.nextInt();
      int result = (int)Math.sqrt(y) - (int)Math.sqrt(x);
      int sqrtX = (int)Math.sqrt(x);
      if (sqrtX * sqrtX == x) 
        result += 1;
      System.out.println(result);
      T -= 1;
    }
  }
}