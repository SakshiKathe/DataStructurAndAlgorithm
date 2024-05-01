package Library;
import java.util.*;

public class KClosestElement{
    public static List<Integer> findClosestElememt(int[] arr, int k, int x){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int integer : arr){
            if(k>0){
                minHeap.offer(integer);
                k--;
            }
            else if(Math.abs(minHeap.peek() - x) > Math.abs(integer - x)){
                minHeap.poll();
                minHeap.offer(integer);
            }
        }
        List<Integer> ans = new ArrayList<>();
        while(!minHeap.isEmpty()){
            ans.add(minHeap.poll());
        }
        return ans;
        
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(findClosestElememt(arr, 4, 3));
    }
}