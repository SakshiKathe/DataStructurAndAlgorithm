//Maximum of all subarrays of size k

package QueueTopic;

import java.util.*;

public class Ass5 {
    public static void printMax(int arr[], int n, int k) {
        Deque<Integer> q = new LinkedList<>();
        for (int i = 0; i < k; ++i) {
            while (!q.isEmpty() && arr[i] >= arr[q.peekLast()])
                q.removeLast();
            q.addLast(i);
        }
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[q.peek()] + " ");
            while ((!q.isEmpty()) && q.peek() <= i - k)
                q.removeFirst();

            while ((!q.isEmpty()) && arr[i] >= arr[q.peekLast()])
                q.removeLast();
            q.addLast(i);

            System.out.println(arr[q.peek()]);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 1, 4, 5, 2, 6 };
        int k = 3;
        printMax(arr, arr.length, k);
    }
}
