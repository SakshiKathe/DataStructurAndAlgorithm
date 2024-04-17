//Generate Binary Numbers

package QueueTopic;

import java.util.*;

public class Ass1 {
    static void generateBinary(int n) {
        Queue<String> q = new LinkedList<>();
        q.add("1");
        while (n-- > 0) {
            String s1 = q.remove();
            // q.remove();
            System.out.println(s1);
            // String s2 = s1;
            q.add(s1 + '0');
            q.add(s1 + '1');
        }
    }

    public static void main(String[] args) {
        int n = 10;
        generateBinary(n);
    }
}
