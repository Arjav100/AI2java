package Week4;
import java.util.Scanner;


/**
 * Write a description of class GradeEvaluator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GradeEvaluator
{
    public static void main(String[]arg)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your grade");
        int num = sc.nextInt();
        System.out.println((num>=40)?"Pass\n":"Fail\n");
        
    }
}