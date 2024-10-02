import java.util.Scanner;

class Driver {

   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      StringTools sTools = new StringTools();
      
      //question 1
      System.out.println("lastLetter test cases:");
      System.out.println("Enter a word with at least one character:");
      String answer1 = input.nextLine();
      System.out.println("The last letter is " + sTools.lastLetter(answer1));
      
      //question 2
      System.out.println("formatPhoneNumber test cases:");
      System.out.println("Enter a ten digit phone number");
      String phoneNumber = input.nextLine();
      System.out.println(sTools.formatPhoneNumber(phoneNumber));
      
      //question 3
      System.out.println("middleThree test cases:");
      System.out.println("Enter a word that is odd in length and at least three letters");
      String word1 = input.nextLine();
      System.out.println(sTools.middleThree(word1));
      
      //question 4
      System.out.println("swapLastTwo test cases:");
      System.out.println("Enter a word that is at least two letters long");
      String word2 = input.nextLine();
      System.out.println(sTools.swapLastTwo(word2));
      
      //question 5
      System.out.println("frontAgain test cases:");
      System.out.println("Enter a word and a value for n");
      String word3 = input.nextLine();
      int number= input.nextInt();
      System.out.println(sTools.frontAgain(word3,number));

    }
}