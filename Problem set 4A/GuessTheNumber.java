
/**
 * Write a description of class GuessTheNumber here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;
public class GuessTheNumber
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("I'm thinking of a number between 1 and 100. Can you guess it?");
        System.out.print("Your guess: ");
        int number2 = input.nextInt();
        
        int number1 = (int) (Math.random() *100) +1;
        int numberofguesses=0;
        
        while (number1 != number2) {
        number2 = input.nextInt();
        numberofguesses++;
        
        if (number2 < number1){
            System.out.println("Too low! Try again.");
        }
        else if (number2 > number1){
            System.out.println("Too high! Try again.");
    
    }
    else{ 
     System.out.println("You guessed it! It took you "+ numberofguesses + " tries." );
    }
    input.close();
}
}
}
