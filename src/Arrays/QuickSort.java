package Arrays;

import java.util.Arrays;

/**
 * Created by rupeshkb on 6/25/17.
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] a= {2,1,4,9,6,5,7,3};
        sort(a, 0,7);
        System.out.println(Arrays.toString(a));

    }

    public static void sort(int[] a, int start, int end){

        int pIndex = partition(a, start, end);
        if(start < pIndex-1)
            sort(a, start, pIndex-1);
        if(pIndex < end)
            sort(a, pIndex+1, end);
    }


    public static int partition(int[] a, int start, int end){
        int temp;
         int i = start, j= end;
        int pivot = a[(start+end)/2];
        while (i <= j){
            while (a[i] < pivot){
                i++;
             while (a[j] > pivot){
                 j--;
             }
             if(i<=j){
                 temp = a[i];
                 a[i] = a[j];
                 a[j] = temp;
                 i++;
                 j--;
             }
            }
        }
        return i;
    }

}
