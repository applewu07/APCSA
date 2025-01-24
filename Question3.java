
/**
 * Write a description of class Question3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;

public class Question3 {


    public static ArrayList<Integer> add(ArrayList<Integer> bigInt1, ArrayList<Integer> bigInt2) {
        ArrayList<Integer> result = new ArrayList<>();
        int carry = 0;

        
        int len1 = bigInt1.size();
        int len2 = bigInt2.size();
        
                int i = len1 - 1;
        int j = len2 - 1;

       
        while (i >= 0 || j >= 0 || carry != 0) {
            int sum = carry;  

            if (i >= 0) {
                sum += bigInt1.get(i);  
                i--;
            }

            if (j >= 0) {
                sum += bigInt2.get(j);  
                j--;
            }

            
            result.add(0, sum % 10);  
            carry = sum / 10; 
        }

        return result;
    }
}
