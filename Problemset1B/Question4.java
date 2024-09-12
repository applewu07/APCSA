import java.util.Scanner;

public class Question4 {
    
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of units you're buying:");
        double quantity = input.nextDouble();
        
        System.out.println("Enter the price per unit:");
        double price = input.nextDouble();
        
        System.out.println("Enter the tax rate:");
        double taxrate = input.nextDouble();
        
        double totalprice = (price * quantity) * (1+(taxrate/100.0));
        
        System.out.println("Purchasing " + quantity + " units " + "at $" + price + " with a %"+ taxrate + " will cost $" + totalprice + ".");
    }
}
