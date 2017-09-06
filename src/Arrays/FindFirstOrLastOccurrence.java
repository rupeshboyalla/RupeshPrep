package Arrays;

import sun.jvmstat.perfdata.monitor.PerfStringVariableMonitor;

/**
 *
 * In a given array find first occurrence of an element index and last occurrence of an
 * element.
 *
 * ex: [0,1,2,3,3,3,4,5] element is 3 first occurrence index is 3 and Last occurrence is 5
 *
 *
 *
 *
 *
 */
public class FindFirstOrLastOccurrence {

    public static void main(String[] args) {
        int[] a = {0,1,2,3,3,3,3,4,5,6};
        System.out.println(searchForElement(a, 3, true));
        System.out.println(searchForElement(a,3,false));

    }

    public static int searchForElement(int[] a , int value, boolean fistIndex){
        int low =0, high = a.length-1 , result =-1;
        while(low <= high){
            int mid = (low+high)/2;
            if(a[mid] == value){
                result = mid;
                if(fistIndex)
                    high = mid -1;
                else
                    low = mid +1;
            }else if(a[mid] > value)
                 high = mid -1;
            else
                low = mid +1;
        }
        return result;
    }
}
