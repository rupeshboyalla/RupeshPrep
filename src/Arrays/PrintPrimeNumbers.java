package Arrays;

/**
 * Created by rupeshkb on 8/2/17.
 */
public class PrintPrimeNumbers {
    public static void main(String[] args) {
        printPrimes(100);

    }

    public static void printPrimes(int n){
        if(n==0)
            return;
        for(int i=0; i <= n; i++){
            if(i%n !=0)
                System.out.println(i);
        }

    }
}
