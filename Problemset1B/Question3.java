import java.util.Scanner;

public class Question3 {
    
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many days?");
        int totaldays = input.nextInt();
        
        int weeks = totaldays/7;
        int remainingdays = totaldays - weeks * 7;
        
        System.out.println("The number of weeks is " + weeks + ".");
        System.out.println("The number of days remaining is " + remainingdays + ".");
    }
}
