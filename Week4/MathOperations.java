package Week4;
import java.util.Scanner;


/**
 * Write a description of class MathOperations here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MathOperations
{
    public static void main(String[]arg)
    {
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        System.out.println((num>=40)?"Pass":"Fail");
        
    }
    
}