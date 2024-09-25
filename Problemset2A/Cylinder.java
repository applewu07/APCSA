
public class Cylinder{
    
    //instances variables 
    double height;
    Circle base;
    
    public Cylinder() {
        //default constructor 
        height = 1;
        base =  new Circle(1);
    }
    //constructor 
    public Cylinder(double h,double r) {
        height=h;
        base = new Circle(r);
    }
    //behaviour methods
    public String toString() {
        return "Hellow, I am a cylinder with height of " + height + " and radius of " + base.getRadius() + ".";
        

    }

    public double getRadius() {
        return base.getRadius();
    }
    
    public double getHeight() { 
        return height;
        
    }
    
    public double surfaceArea() {
        return 2*Math.PI*base.getRadius()*height+2*Math.PI*base.getRadius()*base.getRadius();
    }
    
    public double volume() {
        return Math.PI *base.getRadius()*base.getRadius() *height;
    }
}
