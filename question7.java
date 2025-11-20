import java.util.Scanner;

public class question7
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the medicine you want to buy: ");
        String name = sc.nextLine();

        System.out.print("Enter the stock: ");
        int stock = sc.nextInt();
        int price = 200;

        sc.nextLine(); // <-- consume the leftover newline

        System.out.print("Enter the medicine you want to buy as a customer: ");
        String cname = sc.nextLine();
        if(cname.equals(name)){

        System.out.println("Enter the number of medicines you want, stock: " + stock + " Price: Rs " + price);
        int cstock = sc.nextInt();

        System.out.println((cstock > stock)? "The amount entered exceeds the stock available": "Your total is: Rs " + (price * cstock));
        System.out.println("Remaining stock: " + (stock-cstock));
    }
    else{
        System.out.println("The medicine you entered is not available");
    }
    }
}
