public class image2{
    
    public static void main(String[] args) {
        
        StdDraw.setScale(0, 500);
        
        for (int i = 0; i <= 500; i += 20) {

            StdDraw.line(i, 0, 500, i);
            StdDraw.line(0, i, i, 500);
        }
    
    }
}