package Arrays;

/**
 *
 * get the count of how many times a given element is repeated.
 *
 * Condition: Given array is sortedarray
 *
 * Method -1:
 * Many way we can solve this iterate each element and count
 * Time complexity is O(n)
 *
 * Method -2:
 *
 * Insert given array to the map and get the element count
 * Time complexity is O(n) and space complexity is also O(n)
 *
 * Method -3:
 *
 * Use Binary search and find the element if you find the element slide left
 * and right to get the count.
 *
 *
 *
 *
 */
public class RepeatedElementCount {

    public static void main(String[] args) {
        int[] a = {1,1,1,2,3,4,5,6};
        int firstOccurance = findElement(a, 1, true);
        if(firstOccurance != -1) {
            int secOccurance = findElement(a, 1, false);
            System.out.println(secOccurance-firstOccurance+1);
        }
        else
        System.out.println(firstOccurance);

    }


    public static int findElement(int[] a, int value, boolean searchFirst){
        int low =0, high = a.length -1, result = -1;
        while(low <= high){
            int mid = (low+high)/2;
            if(a[mid] == value){
                result = mid;
                if(searchFirst)
                    high = mid-1;
                else
                     low = mid +1;
            }
            else if(value < a[mid])
                high = mid-1;
            else
                low = mid+1;
        }
        return result;
    }

}
