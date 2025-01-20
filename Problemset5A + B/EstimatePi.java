public class EstimatePi {

    public static void main(String[] args) {
        final Fraction MILU = new Fraction(355, 113); 
        final double EPSILON = Math.abs(Math.PI - MILU.toDouble()); 

        Fraction closestFraction = new Fraction(3, 1); 
        double closestDifference = Math.abs(Math.PI - closestFraction.toDouble());

        int numerator = 3;
        int denominator = 1;

        while (closestDifference >= EPSILON) {
            Fraction currentFraction = new Fraction(numerator, denominator);
            double currentDifference = Math.abs(Math.PI - currentFraction.toDouble());

            if (currentDifference < closestDifference) {
                closestFraction = currentFraction;
                closestDifference = currentDifference;
            }

            if (currentFraction.toDouble() < Math.PI) {
                numerator++;
            } else {
                denominator++;
            }
        }

        System.out.println("Closest Fraction to π: " + closestFraction);
    }
}