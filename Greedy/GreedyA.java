//Activity Selection 

package Greedy;

import java.util.*;

public class GreedyA {
    public static void main(String[] args) {
        int start[] = { 1, 3, 0, 5, 8, 5 };
        int end[] = { 2, 4, 6, 7, 9, 9 };

        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        // 1st ACtivity
        maxAct = 1;
        ans.add(0);
        int lastEnd = end[0];
        for (int i = 1; i < end.length; i++) {
            if (start[i] >= lastEnd) {
                // activity select - non overlapping
                maxAct++;
                ans.add(i);
                lastEnd = end[i];
            }
        }
        System.out.println("Max Activity is " + maxAct);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(" A" + ans.get(i));
        }
        System.out.println();
    }
}