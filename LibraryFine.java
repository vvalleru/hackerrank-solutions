import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LibraryFine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String actualDate = scanner.nextLine();
        String expectedDate = scanner.nextLine();
        
        int aYear = Integer.valueOf(actualDate.substring(actualDate.length() - 4));
        int eYear = Integer.valueOf(expectedDate.substring(expectedDate.length() - 4));
        
        int aMonth = getMonth(actualDate);
        int eMonth = getMonth(expectedDate);
        
        int aDay = getDay(actualDate);
        int eDay = getDay(expectedDate);
        
        if (aYear > eYear)
            System.out.println(10000);
        else if (aYear == eYear && aMonth > eMonth)
            System.out.println(500 * (aMonth - eMonth));
        else if (eYear == aYear && aMonth == eMonth && aDay > eDay)
            System.out.println(15 * (aDay - eDay));
        else
            System.out.println(0);
    }
    
    private static int getMonth(String input) {
        int month;
        int length = input.length();
        if (input.charAt(length - 7) == ' ') {
            month = Integer.valueOf(input.substring(length - 6, length - 5));
        } else {
            month = Integer.valueOf(input.substring(length - 7, length - 5));
        }
        
        return month;
    }
    
    private static int getDay(String input) {
        int day;
        if (input.charAt(1) == ' ') {
            day = Integer.valueOf(input.substring(0, 1));
        } else {
            day = Integer.valueOf(input.substring(0, 2));
        }
        
        return day;
    }
}