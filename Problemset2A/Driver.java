

public class Driver{
    
    public static void main (String[] args) {
        //instantiation
        Circle c1 = new Circle();
        Circle c2 = new Circle(5);
        
        System.out.println(c1);
        System.out.println("getRadius() --> " + c1.getRadius() + " units.");
        System.out.println("circumference() --> " + c1.circumference() + " units.");
        
        System.out.println(c2);
        System.out.println("getRadius() --> " + c2.getRadius() + " units.");
        System.out.println("circumference() --> " + c2.circumference() + " units.");
        
    }
}
