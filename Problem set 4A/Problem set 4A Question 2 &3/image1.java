public class image1{ 
    
    public static void main(String[] args) {

        StdDraw.setScale(0, 500);
        
    for (int i = 0; i <= 500; i += 20) {
    StdDraw.line(i, 0, i, 500); 
    StdDraw.line(0, i, 500, i); 
        }
    }
    
}
    