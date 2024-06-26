//Queue using Java Collection Framework

package QueueTopic;

import java.util.*;

public class QueueD {
    public static void main(String[] args) {
        // Queue q = new Queue();
        // Queue<Integer> q = new LinkedList<>();
        Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
