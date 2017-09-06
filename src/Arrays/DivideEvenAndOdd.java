package Arrays;

/**
 * For a given array divide even and odd.
 *
 *
 */
public class DivideEvenAndOdd {

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9};
        divideEvenAndOdd(a);
        display(a);
    }

    public static void divideEvenAndOdd(int[] a) {
        if (a.length == 0)
            throw new IllegalArgumentException("Given array is empty");

        int i = 0;
        int length = a.length - 1;
        while (i < length) {
            while (a[i] % 2 == 0) {
                i++;
            }

            while (a[length] % 2 != 0) {
                length--;
            }

            if (i < length) {
                swap(a, i, length);
                i++;
                length--;
            }


        }
    }

    public static void swap(int[] a, int x, int y){
            int temp = a[x];
            a[x] = a[y];
            a[y] = temp;
    }

    public static void display(int[] a){
            for (int i=0; i< a.length; i++){
                System.out.println(a[i]);
            }
    }
}
