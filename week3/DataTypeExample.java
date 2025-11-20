package week3;


/**
 * Write a description of class DataTypeExample here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DataTypeExample
{
    public static void main(String[]arg)
    {
        /* System.out.println(Float.MAX_VALUE+"\n"+Float.MIN_VALUE+"\n"+Float.BYTES+"\n"+Float.SIZE); */
        
        
        /** byte b = 140;this is because the max range for byte is 127
        *
        * byte b = 12;
        * byte d = 13;
        * byte e = b + d;  this shows an error because byte always gives result in int, i.e we need to use typecasting -- explicit typecasting 
        */
       
        byte b = 12;
        byte d = 13;
        byte e = (byte)(b+d);
        float f = 233.3f;
        long l = 200l;
        int a = 20;
        float g = 2.33f;
        double h = 2.334;
        
        double x = (double)(a + g + h);
        System.out.println(x);
        
        int c = 'A' + 'B';
        System.out.println(c);
        
        int v = 50;
        System.out.println((char)v);
        
        
        int length = 10;
        int breadth = 20;
        
        System.out.print("Perimeter = " + (length*breadth) +"\n"+ "Area = "+ (2*(length+breadth)));
        
        int principle = 500;
        int time = 2;
        float rate = 2.4f;
        float si = (float)((principle*rate*time)/100);
        float ci_1 = (float)(1+(rate/100));
        float ci_2 = (float)Math.pow(ci_1, time);
        float ci = (float)(principle*ci_2);
        System.out.println("Simple interest = "+si+"\nCompund interest = "+(ci-principle));
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}