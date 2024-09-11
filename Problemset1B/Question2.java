import java.util.Scanner;

public class Question2 {
    
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is your weight in kg?");
        double weight = input.nextDouble();
        
        System.out.println("What is your height in m?");
        double height = input.nextDouble();
        
        double BMI = weight/(height*height); 
        
        System.out.println("Your BMI is " + BMI + ".");
    }
}
