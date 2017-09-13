package Arrays;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * Created by rupeshkb on 7/18/17.
 */
public class MedianOfTwoSortedArray {
    PriorityQueue<Integer> maxHeap;
    PriorityQueue<Integer> minHeap;
    public MedianOfTwoSortedArray(){
        maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        minHeap = new PriorityQueue<>();
    }
    public static void main(String[] args) {


    }


    public void add(int[] a, int[]b){
        for(int ele : a){
            maxHeap.add(ele);
            minHeap.add(maxHeap.remove());
            if(maxHeap.size() < minHeap.size()){
                maxHeap.add(maxHeap.remove());
            }
        }
        for(int ele : b){
            maxHeap.add(ele);
            minHeap.add(maxHeap.remove());
            if(maxHeap.size() < minHeap.size()){
                maxHeap.add(maxHeap.remove());
            }
        }
    }
    public double findMedian() {
        if(maxHeap.size() == minHeap.size())
            return (double) (maxHeap.peek()+minHeap.peek())/2;
        else
            return maxHeap.peek();
    }
}
