package Arrays;

/**
 *  Find out how many times given array is rotated.
 * Condition: No duplicates in an array and array is sorted array
 *
 * Ex: give array = 1,2,3,4,5,6,7
 *  2,3,4,1,5,6,7
 *
 *  This array is rotated 3 times
 *
 *
 *
 */
public class HowManyGiveArrayIsRotated {

    public static void main(String[] args) {

    }

    public static int rotationCount(int[] a){
        int length = a.length-1, low = 0, high = length;
        while (low <= high){
            if(a[low] <= a[high])
                return low;
            int mid = (low+high)/2;
            int prev = (mid+length-1)%length;
            int next = (mid+1)%length;
            if(a[mid] <= a[next] && a[mid] <= a[prev])
                return mid;
            else if(a[mid]<= a[high])
                high = mid -1;
            else if(a[mid] >= a[low])
                low = mid+1;

        }
        return -1;
    }

}
