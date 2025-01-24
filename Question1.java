
/**
 * Problem Set 7c 
 * Andrea Wang
 */
import java.util.ArrayList;

public class Question1 {

    public static ArrayList<Integer> sieveOfEratosthenes(int n) {
        ArrayList<Integer> primes = new ArrayList<>();
        
        
        if (n < 2) {
            return primes; 
        }

        
        boolean[] isPrime = new boolean[n + 1];

        
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        
        for (int p = 2; p * p <= n; p++) {
            if (isPrime[p]) {
               
                for (int i = p * p; i <= n; i += p) {
                    isPrime[i] = false;
                }
            }
        }

        
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }

        return primes;
    }
}