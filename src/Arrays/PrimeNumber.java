package Arrays;

import java.io.RandomAccessFile;

/**
 * Created by rupeshkb on 7/19/17.
 */
public class PrimeNumber {
    public static void main(String[] args) {
       // System.out.println( isPrime(9));
        printPrimes(100);

    }

    public static boolean isPrime(int n){
        if(n%2 ==0) return false;
        for(int i=3; i*i<=n; i+=2){
            if(n%i ==0)
                return false;
        }
        return true;
    }

    public static void printPrimes(int n){
        for(int i=0; i <= n; i++){
            if(i ==1 || i==2 || isPrime(i))
                System.out.println(i);

        }
    }
}
