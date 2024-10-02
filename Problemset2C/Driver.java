import java.util.Scanner;
public class Driver {
    
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        
        OrderedPair num1 = new OrderedPair (); 
        OrderedPair num2 = new OrderedPair (2,4);
        
        System.out.println (num1.toString());
        System.out.println (num2.toString());
        
        System.out.println (num1.getX());
        System.out.println (num1.getY());
        System.out.println (num2.getX());
        System.out.println (num2.getY());
        
                //testing method 1
        Formulas formulas= new Formulas();
        System.out.println ("QUADRATIC FORMULA: Find the roots of ax^2 + bx + c. Enter a, b and c: ");
        System.out.print ("a: ");
        double a = input.nextDouble(); 
        System.out.print ("b: ");
        double b = input.nextDouble(); 
        System.out.print ("c: ");
        double c = input.nextDouble(); 
        System.out.println ("The solutions for " + a + "x^2 + " + b + "x + " + c + " are " + formulas.findQuadraticRoots(a, b, c));
        System.out.println ("");
        
        // testing method 2
        System.out.println("Enter value for x1: ");
        double x1= input.nextDouble();
        System.out.println("Enter value for x2: ");
        double x2= input.nextDouble();
        System.out.println("Enter value for y1: ");
        double y1= input.nextDouble();
        System.out.println("Enter value for y2: ");
        double y2= input.nextDouble();
        OrderedPair OrderedPair1= new OrderedPair(x1,y1);
        OrderedPair OrderedPair2= new OrderedPair(x2,y2);
        System.out.println("A line between "+ OrderedPair1 + " and " + OrderedPair2  + " has a slope of " + formulas.findSlope(OrderedPair1, OrderedPair2) );
        
        //testing method 3
        
        System.out.println("Enter value for x1: ");
        double x11= input.nextDouble();
        System.out.println("Enter value for x2: ");
        double x22= input.nextDouble();
        System.out.println("Enter value for y1: ");
        double y11= input.nextDouble();
        System.out.println("Enter value for y2: ");
        double y22= input.nextDouble();
        OrderedPair OrderedPairOne= new OrderedPair(x11,y11);
        OrderedPair OrderedPairTwo= new OrderedPair(x22,y22);
        System.out.println("A midpoint between "+ OrderedPairOne + " and " + OrderedPairTwo  + " is " + formulas.findMidpoint(OrderedPairOne, OrderedPairTwo));
        
        //testing method 4
        
        System.out.println("Enter value for a: ");
        double value1= input.nextDouble();
        System.out.println("Enter value for d: ");
        double value2= input.nextDouble();
        System.out.println("Enter value for k: ");
        int value3= input.nextInt();
        System.out.println(" The sum of the first 5 terms of an arithmetic series that starts with" + value1+ " and increases by " + value2 + " is " + formulas.findArithmeticSeriesSum (value1, value2, value3));
        
        //testing method 5
        
        System.out.println("Number of terms:");
        int number3= input.nextInt();
        System.out.println("Starts with:");
        double number1= input.nextDouble();
        System.out.println("Rate of Growth:");
        double number2= input.nextDouble();
        System.out.println( "The sum of the first 3 terms of a finite geometric series that starts with " +  number1+ " and increases by a rate of " + number2 + " is " + formulas.findGeometricSeriesSum(number1, number2, number3));
        
        System.out.println("How many sides does your die have?");
        int number6= input.nextInt();
        System.out.println("Rolling a " + number6+ " sided die...... you got a "+  formulas.rollDie(number6) );

        
        
        

    }
}