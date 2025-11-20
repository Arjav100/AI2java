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
        
        System.out.println("Enter first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter second number:");
        int num2 = sc.nextInt();
        System.out.println("Enter third number:");
        int num3 = sc.nextInt();
        if(num1==num2 || num1==num3 || num2==num3)
        {
            System.out.println("Either two numbers or all three are equal\n");
        }
        else if(num1>num2 && num1>num3)
        {
            System.out.println(num1+" is greater\n");
        }
        else if(num2>num3 && num2>num1)
        {
            System.out.println(num2+" is greater\n");
        }
        else
        {
            System.out.println(num3+ " is greater\n");
        }
        
    }
    
}