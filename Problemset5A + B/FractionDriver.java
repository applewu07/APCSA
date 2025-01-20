
public class FractionDriver
{
public static void main (String[] args){
    
    Fraction whole = new Fraction();
    Fraction half = new Fraction(1,2);
    Fraction anotherHalf = new Fraction (half);
    
    System.out.println(whole);
    System.out.println(half);
    System.out.println(anotherHalf);
    
    System.out.println (anotherHalf.getNum());
    System.out.println (anotherHalf.getDenom());
    System.out.println(anotherHalf.toDouble());

    
    Fraction impFraction = new Fraction (5,10);
    impFraction.reduce();
    System.out.println(impFraction);
    
    Fraction third = new Fraction(1, 3);
    System.out.println("Add (1/2 + 1/3): " + Fraction.add(half, third));
    System.out.println("Subtract (1/2 - 1/3): " + Fraction.subtract(half, third));
    System.out.println("Multiply (1/2 * 1/3): " + Fraction.multiply(half, third));
    System.out.println("Divide (1/2 / 1/3): " + Fraction.divide(half, third));
    
    
    Fraction mutableFraction = new Fraction();
    System.out.println("Initial Mutable Fraction: " + mutableFraction);
    mutableFraction.setNum(7);
    System.out.println("Updated Numerator: " + mutableFraction);
    mutableFraction.setDenom(14);
    System.out.println("Updated Denominator: " + mutableFraction);
    mutableFraction.reduce();
    System.out.println("Reduced Mutable Fraction: " + mutableFraction);
    
}
}
