package Week4;
import java.util.Scanner;


/**
 * Write a description of class TimeConversion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TimeConversion
{
    public static void main(String[]arg)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the time in seconds");
        int sec = sc.nextInt();
        int hours = (sec/3600);
        int mins = ((sec%3600)/60);
        int secs = sec%60;
        
        
        
        System.out.println(hours+" hrs "+mins+" mins "+secs+" secs");
        
    }
}