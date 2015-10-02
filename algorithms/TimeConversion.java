import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TimeConversion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        String hour = input.substring(0, 2);
        String ap = input.substring(input.length() - 2);
        String result;
        
        if (ap.equals("AM")) {
            if (hour.equals("12"))
                result = "00" + input.substring(2, input.length() - 2);
            else
                result = input.substring(0, input.length() - 2);                
        }
        else {
            if (hour.equals("12"))
                result = String.valueOf(Integer.valueOf(hour)) + input.substring(2,input.length() - 2);
            else
                result = String.valueOf(Integer.valueOf(hour) + 12) + input.substring(2,input.length() - 2);
        }
        
        System.out.println(result);
    }
}