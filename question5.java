import java.util.Scanner;

/**
 * Write a description of class question5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class question5
{
    public static void main(String[]arg)
    {
        Scanner sc = new Scanner(System.in);  // create a Scanner object

        System.out.print("Enter first number: ");
        int firstNum = sc.nextInt();
        System.out.print("Enter second number: ");
        int secondNum = sc.nextInt();
        int add = firstNum + secondNum;
        int sub = firstNum - secondNum;
        int mult = firstNum * secondNum;
        float div = (float)firstNum / secondNum;
        int remainder = firstNum % secondNum;
        System.out.println("The sum is " + add);
        System.out.println("The difference is " + sub);
        System.out.println("The product is " + mult);
        System.out.println("The quotient is " + div);
        System.out.println("The remainder is " + remainder);
        int bigger=(firstNum>secondNum)?firstNum:secondNum;
        System.out.println("The greater number is " + bigger);
        
        
    }
}