import java.util.Random;
import java.util.Scanner;

public class FractionQuizGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int wins = 0;
        int losses = 0;

        System.out.println("Let the Fraction Quiz Begin. Answers should be in lowest terms. Good luck!");

        while (true) {
            
            Fraction fraction1 = new Fraction(random.nextInt(9) + 1, random.nextInt(9) + 1);
            Fraction fraction2 = new Fraction(random.nextInt(9) + 1, random.nextInt(9) + 1);
            int operator = random.nextInt(4); 
            
            Fraction correctAnswer;
            String operatorSymbol;
            switch (operator) {
                case 0:
                    correctAnswer = Fraction.add(fraction1, fraction2);
                    operatorSymbol = "+";
                    break;
                case 1:
                    correctAnswer = Fraction.subtract(fraction1, fraction2);
                    operatorSymbol = "-";
                    break;
                case 2:
                    correctAnswer = Fraction.multiply(fraction1, fraction2);
                    operatorSymbol = "*";
                    break;
                default:
                    correctAnswer = Fraction.divide(fraction1, fraction2);
                    operatorSymbol = "/";
                    break;
            }

  
            System.out.println(fraction1 + " " + operatorSymbol + " " + fraction2 + " = ?");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("quit")) {
                break;
            }

       
            String[] parts = input.split("/");
            Fraction userAnswer = new Fraction(Integer.parseInt(parts[0]), Integer.parseInt(parts[1]));

            if (userAnswer.equals(correctAnswer)) {
                System.out.println("Correct!");
                wins++;
            } else {
                System.out.println("Wrong, the answer was " + correctAnswer);
                losses++;
            }
        }

     
        Fraction winLossRatio = new Fraction(wins, wins + losses);
        int percentage = (int) Math.round((double) wins / (wins + losses) * 100);

        System.out.println("\nYour win/loss ratio was " + winLossRatio + ", for a score of " + percentage + " percent!");
        scanner.close();
    }
}