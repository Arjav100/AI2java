import java.util.Scanner;

/**
 * Write a description of class question8 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class question8
{
    public static void main(String[]arg)
    {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        System.out.print("Enter the third number: ");
        int c = sc.nextInt();
        int bigger=(firstNum>secondNum)?firstNum:secondNum;
        System.out.println(((a>b)&&(a>c)):(b>a):(b>c));
    }
}