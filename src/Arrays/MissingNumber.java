package Arrays;

/**
 * Created by rupeshkb on 7/17/17.
 */
public class MissingNumber {

    public static void main(String[] args) {
        int[] a = {1,2,3,5,6,7,9,8,10};
        System.out.println(missingNumber(a));

    }

    public static int missingNumber(int[] a){
        if(a.length ==0 )
            throw new IllegalArgumentException("Input array is empty");
        int start = 0, end = a.length -1;
        while (start <= end ){
            int mid = (start+end)/2;
            if(a[mid] - a[mid-1] > 1)
                return a[mid] -1;
            else if(a[mid] > mid+1 )
                  end = mid - 1;
            else
                start = mid + 1;
        }

        return  -1;
    }
}
