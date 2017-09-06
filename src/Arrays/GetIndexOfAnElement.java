package Arrays;

/**
 * Created by rupeshkb on 9/2/17.
 */
public class GetIndexOfAnElement {

    public static void main(String[] args) {
        int [] num = new int[]{4, 1, 9, 6, 3, 15, 19, 17, 18};
        GetIndexOfAnElement obj = new GetIndexOfAnElement();
        System.out.println(obj.getIndex(num, 0, num.length-1, 15));
    }

    public int getIndex(int[] a, int start, int end , int k){
        if(a.length >1){
            int pivot = partition(a, start, end);

            if(k < a[pivot])
                return getIndex(a, 0, pivot-1, k);
            if (k > a[pivot])
                return getIndex(a,pivot+1, end, k);
            else
                return pivot;
        } else
            return 0;
    }


    public int partition(int[] a, int start, int end){

        int pivot = a[(start+end)/2];
        int i = start, j = end;

        while(i < j){
            while (a[i] < pivot){
                i++;
            }
            while(a[j] > pivot){
                j--;
            }
            if(i < j){
                swap(a, i, j);
                i++;
                j--;
            }

        }

        return j;
    }

    public void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
