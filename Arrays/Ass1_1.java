package Arrays;

import java.util.*;
import java.util.HashSet;

// using brute force approach
public class Ass1_1 {
    public static boolean getnums(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j])
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 1 };
        System.out.println(getnums(nums));
    }
}

// Using HashSet
// public class Ass1_1 {
// public static boolean getnums(int nums[]) {
// HashSet<Integer> set = new HashSet<>();
// for (int i = 0; i < nums.length; i++) {
// if (set.contains(nums[i])) {
// return true;
// }
// }
// return false;
// }

// public static void main(String[] args) {
// int nums[] = { 1, 2, 3, 1 };
// System.out.println(getnums(nums));
// }
// }