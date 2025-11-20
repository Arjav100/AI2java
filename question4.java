import java.util.Scanner;

/**
 * Write a description of class question4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class question4
{
    public static void main(String[]arg)
    {
    Scanner sc = new Scanner(System.in);  // create a Scanner object

    System.out.print("Enter your name: ");
    String name = sc.nextLine();
    System.out.print("Enter your age: ");
    int age = sc.nextInt();
    System.out.print("Enter your gpa: ");
    float gpa = sc.nextFloat();
    System.out.print("Name: " + name + " Age: " + age + " GPA: " + gpa);
    }
}