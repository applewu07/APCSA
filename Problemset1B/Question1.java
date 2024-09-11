import java.util.Scanner;

public class Question1 {
    
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of degrees in celsius:");
        double C =  input.nextDouble();
        double F = C *( 9.0/5) + 32;
        
        System.out.println(F);
    }
}