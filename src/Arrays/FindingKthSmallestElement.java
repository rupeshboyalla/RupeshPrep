package Arrays;

/**
 * Created by rupeshkb on 7/17/17.
 */
public class FindingKthSmallestElement {

    public static void main(String[] args) {
        int[] a = {0,1,2,3,4,5,6,7,8,9};
        System.out.println(kthSmallest(a,0,a.length-1, 3));

    }

    public static int kthSmallest(int[] a, int start, int end , int k){
        if(k < 0)
            return -1;
        if(a.length >1) {
            int pivot = partition(a, start, end);
            if (k == pivot + 1)
                return a[pivot];
            else if (k > pivot + 1)
                return kthSmallest(a, pivot + 1, end, k);
            else
                return kthSmallest(a, start, pivot - 1, k);
        }
        return -1;
    }


    public static int partition(int[] a, int start, int end){
        int pivot = a[start+end/2];
        int i = start, j = end;
        while(i < j){
            while(a[i] < pivot)
                i++;
            while (a[j] > pivot)
                j--;
            if(i<j)
                swap(a, i, j);
        }

        return j;
    }

    public static  void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
