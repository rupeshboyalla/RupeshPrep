package Arrays;

/**
 * Created by rupeshkb on 6/25/17.
 */
public class BinarySearch {

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};
        System.out.println(search(a,6));
    }

   public static int search(int[] a, int value){

        if(a.length ==0 )
            return -1;
        int start =0, end = a.length -1;
        while (start <= end ){
            int mid = (start+end)/2;
            if(a[mid] == value )
                return mid;
            else if(a[mid] < value)
                start = mid +1;
            else end = mid - 1;
        }


        return -1;
   }
}
