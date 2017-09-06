package Arrays;

/**
 *
 *
 *
 *
 */
public class FibonacciSeries {

    public static void main(String[] args) {
        //System.out.println(fibonacci(10));
        System.out.println(fibonacciRecussion(10));
    }

    public static int fibonacciRecussion(int num){
        if (num ==1 || num ==2)
            return 1;

        return fibonacciRecussion(num -1 )+ fibonacciRecussion(num-2);
    }

    public static int fibonacci(int num){
        int num1 = 0, num2 =1, result =1;
        for(int i=0; i< num; i++){
            result = num1+num2;
            num1 = num2;
            num2 = result;
            System.out.println(result);
        }
        return result;
    }
}
