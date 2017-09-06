package Arrays;

/**
 * Reverse digits of an integer.

 Example1: x = 123, return 321
 Example2: x = -123, return -321
 */
public class ReverseInteger {

    public static void main(String[] args) {
        System.out.println(reverse(-321));
    }


    public static int reverse(int x) {
        long result=0;
        while (x != 0){
            result = result*10 + x%10;
            x=x/10;
        }

        if(result <= Integer.MAX_VALUE || result >= Integer.MIN_VALUE)
            return (int) result;
        else
            return 0;
    }
}
