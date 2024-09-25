
/**
 * AP Computer Science A
 * Problem Set 2A
 * By Apple Wu
 */
public class Circle {
    
    //instance varaibles 
    double radius;
    
    public Circle() {
        //default constructor
        radius = 1;
    }

    public Circle(double r) {
        //parameterized constructor 
        radius = r;
    }
    
    //Behaviour Methods!
    public String toString() {
        return "Hello, I am a circle with a radius of " + radius;
    }

    public double getRadius() {
        return radius;
    }

    public double circumference() {
        return 2* Math.PI * radius; 
    }
    
    public double area() {
        return Math.PI * radius * radius;
    }
}    
