package Arrays;

/**
 * Created by rupeshkb on 8/24/17.
 */
public class PrimenumbersAlgo {


    public static int countPrimes(int n){
        boolean[] isPrime = new boolean[n+1];
        for(int i=2; i<=n; i++){
            isPrime[i] = true;
        }
        for(int i=2; i<=n; i++){
            if(isPrime[i]){
                for(int j=i; i*j <= n; j++){
                    isPrime[i*j] = false;
                }
            }

        }

        int count =0;
        for(int i=2; i<n; i++){
            if(isPrime[i]){
                count++;
            }
        }

        return count;
    }
}
