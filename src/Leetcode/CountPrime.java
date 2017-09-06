package Leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by rupeshkb on 8/11/17.
 */
public class CountPrime {

    public static void main(String[] args) {
        CountPrime cp = new CountPrime();
        System.out.println(cp.countPrimes(4));

    }

    public int countPrimes(int n) {
         int count =0;
         if(n ==1 && n == 2)
             return 0;


        for(int i =2; i< n; i++) {
            if (isPrime(i)) {
                count ++;
            }
        }
        return count;
    }

    public boolean isPrime(int n){
        for(int i=2; i< n ; i++){
            if(n%i == 0) {
                return false;
            }
          }
        return true;
    }


    public int countPrimeUsingAlgo(int n){
        boolean[] isPrime = new boolean[n+1];
        for(int i=2; i<=n; i++){
            isPrime[i] = true;
        }
        for (int i=2; i*i<=n ; i++){
            if(isPrime[i]){
                for(int j =i ; i*j <=n; j++){
                    isPrime[i] = false;
                }
            }
        }

        int count =0;

        for(int i=0; i<=n; i++){
            if(isPrime[i])
                count++;
        }
        return count;
    }

}
