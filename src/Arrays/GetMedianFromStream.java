package Arrays;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 *For example, median of the stream, A = [1, 5, 3, 2, 6, 2, 3] is = 3.

 Note that we need to find the running median at any time of the stream. That is each time a new number shows up to the stream we need to update the median. For example,


 A = [1], median = 1
 A = [1,5], median = (5+1)/2 = 3
 A = [1,5,3], median = 3
 A = [1,5,3,2], median = (2+3)/2 = 2
 A = [1,5,3,2,6], median = 3
 A = [1,5,3,2,6,2], median = (2+3)/2 = 2
 A = [1,5,3,2,6,2,3], median = 3
 Observe that at a particular time if there are odd number of elements in then median is the middle element in the sorted order of the stream.
 That is half of the stream is less than the current median and half of them are greater than the current median.
 If there are even number of numbers then median is the average of middle two elements such that half of the numbers are less than the median and half of them are greater.

 So, the idea is to use some data structure that will maintain two lists of elements such that first list is less then or equal to current median and the second list is greater then or equal to the current median. If both list are of same size then the average of the top of the two lists is the median. Otherwise, median is top of the bigger list. Question is what data structure to use?
 *
 *
 *
 *  Similar to balancing BST in above, we can use a max heap on left side to represent elements that are less than the current median, and a min heap on right side to represent elements that are greater than current median.

 After processing an incoming element, the number of elements in heaps differ at most by 1 element. When both heaps are balanced, we pick average of heaps root data as the current median. When the heaps are not balanced, we select current median from the root of heap containing more elements.

 The following is a O(lgn) time implementation for finding median of two sorted arrays using a min heap. Implementations for generic max/min heap could be found in my previous post. However I chose to use Java PriorityQueue to implement max and min heap. By default PriorityQueue behaves as minheap. So, we need to provide reverse natural order comparator to construct max heap.
 *
 *
 *
 */
public class GetMedianFromStream {
    PriorityQueue<Integer> maxHeap;
    PriorityQueue<Integer> minHeap;

    public GetMedianFromStream(){
        maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        minHeap = new PriorityQueue<>();
    }

    public void addNum(int num){
        maxHeap.add(num);
        minHeap.add(maxHeap.remove());
        if(maxHeap.size() < minHeap.size()){
            maxHeap.offer(minHeap.remove());
        }
    }

    public double findMedian(){
        if(maxHeap.size() == minHeap.size()){
            return (double) (maxHeap.peek()+minHeap.peek())/2;
        }else
            return maxHeap.peek();
    }

    public static void main(String[] args) {
        int[] stream = {3,4,1,2,6,9,8,5};
        GetMedianFromStream gt = new GetMedianFromStream();
        for(int i=0; i< stream.length; i++){
            gt.addNum(stream[i]);
        }
        System.out.println(gt.findMedian());

    }
}
