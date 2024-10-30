public class image3 {
    
    public static void main(String[] args) {
        StdDraw.setScale(0, 500);
        
        int radius = 500;
        
         for (int r = radius; r > 0; r -= 10) {
            if (r % 20 == 0) {
                StdDraw.setPenColor(StdDraw.BLACK);
            } else {
                StdDraw.setPenColor(StdDraw.WHITE);
            }
        
            StdDraw.filledCircle(250, 250, r);
        }
        
    }
    
}