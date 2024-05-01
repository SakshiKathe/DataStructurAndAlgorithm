package Library;

import java.util.PriorityQueue;

public class KthLargestElement {
    public static int kthLargestElement(int nums[], int k){
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for(int x : nums){
            heap.add(x);
            if(heap.size() > k){
                heap.poll();
            }
        }
        return heap.peek();
    }
    public static void main(String[] args) {
        int nums[] = {3, 2, 1, 5, 6, 4};
        System.out.println(kthLargestElement(nums, 2));
    }
}
