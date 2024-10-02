public class Formulas {
    
    public OrderedPair findQuadraticRoots (double a, double b, double c){
        double squareRoot =  Math.sqrt(b*b-4*a*c);
        double answer1 = (-b+squareRoot)/(2*a);
        double answer2 = (-b-squareRoot)/(2*a);
        
        OrderedPair OrderedPair1= new OrderedPair(answer1, answer2);
        
        return OrderedPair1;
    }
    
    public double findSlope (OrderedPair A, OrderedPair B){
        double slope = (B.getY()-A.getY())/(B.getX()-A.getX());
        return slope;

        
    }

    public OrderedPair findMidpoint (OrderedPair A, OrderedPair B){
        double midpointX = (A.getX()+B.getX())/2;
        double midpointY = (A.getY()+B.getY())/2;
        
        OrderedPair OrderedPair2= new OrderedPair(midpointX, midpointY);
        
        return OrderedPair2;
    }
    
    public double findArithmeticSeriesSum (double a, double d, int k){
        double sum = (k/2)*(2*a+d*(k-1));
        return sum;

    }
    
    public double findGeometricSeriesSum (double a, double r, int k) {
        return a*((1-Math.pow(r,k))/(1-r));
        
    }

    public int rollDie (int sides){
        return (int) (Math.random() * sides) +1;
    }
    



}