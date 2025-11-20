package Week4;
import java.util.Scanner;

/**
 * Write a description of class DayConversion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DayConversion
{




/**
 * Write a description of class TimeConversion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
    public static void main(String[]arg)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of days");
        int day = sc.nextInt();
        int years = (day/365);
        int months = ((day%365)/30);
        int days = (day%365)%30;
        
        
        
        System.out.println(years+" years "+months+" months "+days+" days");
        
    }

}