package Arrays;

/**
 *
 * In a given sorted array count number of times a element is repeated.
 *
 *
 *
 */
public class CountOccurrenceOfAnElement {

    public static void main(String[] args) {
        int[] a = {0,1,2,3,3,3,3,4,5,6};
        int firstIndex = countOccurrence(a, 3, true);
        int lastIndex = countOccurrence(a,3,false);
        System.out.println("Occurrence of an element "+(lastIndex-firstIndex+1));

    }
    public static int countOccurrence(int[] a , int value, boolean firstIndex){
        int result = -1, low =0, high = a.length -1;
        while (low <= high){
            int mid = (low+high)/2;
            if(a[mid] == value){
                result = mid;
                if(firstIndex)
                    high = mid -1;
                else
                    low = mid +1;
            }else if(a[mid] > value)
                high = mid - 1;
            else
                low = mid +1;
        }
        return result;
    }
}
