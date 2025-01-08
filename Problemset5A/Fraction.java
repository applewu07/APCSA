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
    }
    
