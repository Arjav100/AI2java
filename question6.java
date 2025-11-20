
/**
 * Write a description of class question6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class question6
{
    public static void main(String[]arg)
    {
        var waterLvl = 1100;
        System.out.println("The water level is " + waterLvl + " litres");
        System.out.println((waterLvl>1000)?"WARNING: Water level has reached 1000 litres or more":"Status: Normal");
    }
}