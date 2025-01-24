
/**
 * Write a description of class Question2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Question2
{
        
    
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    
    public static void goldbach(int evenNumber) {
        
        if (evenNumber <= 2 || evenNumber % 2 != 0) {
            System.out.println("Input must be an even number greater than 2.");
            return;
        }
        
       
        for (int i = 2; i <= evenNumber / 2; i++) {
            if (isPrime(i) && isPrime(evenNumber - i)) {
                
                System.out.println(evenNumber + " = " + i + " + " + (evenNumber - i));
                return;  
            }
        }
    }
}