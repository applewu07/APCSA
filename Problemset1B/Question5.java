import java.util.Scanner;

public class Question5 {
    
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print ("Enter a positive, three digit number: ");
        int number = input.nextInt();
        int one = number/100;
        int three = number %100%10;
        int two = number%100/10;
        
        int sum = one + two + three;
        
        System.out.println("The sume of the digits of " + number + " is " + sum + ".");
    }
}
