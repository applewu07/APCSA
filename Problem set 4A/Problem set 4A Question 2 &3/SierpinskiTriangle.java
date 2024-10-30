public class SierpinskiTriangle {

    public static void main(String[] args) {
    StdDraw.setScale(0, 1);
    

OrderedPair vertexA = new OrderedPair(0, 1);
OrderedPair vertexB = new OrderedPair(1, 1);
OrderedPair vertexC = new OrderedPair(0.5, 0);

StdDraw.point(vertexA.getX(), vertexA.getY());
StdDraw.point(vertexB.getX(), vertexB.getY());
StdDraw.point(vertexC.getX(), vertexC.getY());

OrderedPair Point = new OrderedPair(0.5, 0.5);

OrderedPair selectedVertex = new OrderedPair();

 for (int i = 0; i < 100000; i++) {
     
     int randomVertex = (int) ((Math.random() * 3)+1);
     
     
     
     if (randomVertex == 1) {
         selectedVertex = vertexA;
     }
     else if (randomVertex == 2) {
         selectedVertex = vertexB;
         
     }
    else {
        selectedVertex = vertexC;
         
     }
     
    double midpointX = (Point.getX() + selectedVertex.getX()) / 2;
    double midpointY = (Point.getY() + selectedVertex.getY()) / 2;
    Point = new OrderedPair(midpointX, midpointY);
    
     StdDraw.point(Point.getX(), Point.getY());
     
 }
 
  
}
}