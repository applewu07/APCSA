
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
    
}
}
