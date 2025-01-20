public class Fraction { 
    
    private int numerator; 
    private int denominator; 
    
    public Fraction() {
        
        numerator = 1; 
        denominator = 1; 
        
    }
    
    public Fraction (int n, int d) {
        
        numerator =n;
        if (d == 0) {
            System.out.println ("Error: Denominator cannot be zero");
        }
        else {
          
            denominator = d; 
        
    }
}
    public Fraction (Fraction f){
        numerator = f.numerator;
        denominator = f.denominator;
        
    }
    public int getNum(){
        
        return numerator;
    }
    public int getDenom(){
        return denominator;
    }
    public String toString(){
        return numerator+"/" + denominator;
        
    }
    public double toDouble() {
        return (double) numerator/ denominator;
    }
    public void setNum(int n){
        numerator=n;
    }
    public void setDenom (int d){
        if (d==0) {
            System.out.println ("Error: Denominator cannot be zero");
            d=1;
        }
        else{
            denominator = d;
        }
        }
    public void reduce() {
        int factor = GCF (Math.abs(numerator), Math.abs(denominator));
        numerator /= factor;
        denominator/= factor;
    }
    public static Fraction multiply(Fraction f1, Fraction f2) {
        return new Fraction(f1.numerator * f2.numerator, f1.denominator * f2.denominator);
    }

    public static Fraction divide(Fraction f1, Fraction f2) {
        if (f2.numerator == 0) {
            throw new ArithmeticException("Cannot divide by a fraction with a numerator of zero");
        }
        return new Fraction(f1.numerator * f2.denominator, f1.denominator * f2.numerator);
    }

    public static Fraction add(Fraction f1, Fraction f2) {
        int commonDenominator = f1.denominator * f2.denominator;
        int newNumerator = f1.numerator * f2.denominator + f2.numerator * f1.denominator;
        return new Fraction(newNumerator, commonDenominator);
    }

    public static Fraction subtract(Fraction f1, Fraction f2) {
        int commonDenominator = f1.denominator * f2.denominator;
        int newNumerator = f1.numerator * f2.denominator - f2.numerator * f1.denominator;
        return new Fraction(newNumerator, commonDenominator);
    }
    private int GCF (int a, int b){
        if (a==b) {
            return a;
        }
        else if (a>b){
            return GCF (a-b,b);
        }
        else {
            return GCF(a, b-a);
        }
    }
    }
    
