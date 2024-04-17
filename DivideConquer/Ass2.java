//Given an array nums of size n, return the majority elements.

package DivideConquer;

//Approach 1: Brute Force

// public class Ass2 {
//     public static int majorityElement(int[] nums) {

//         int majorityCount = nums.length / 2;
//         for (int i = 0; i < nums.length; i++) {
//             int count = 0;
//             for (int j = 0; j < nums.length; j++) {
//                 if (nums[j] == nums[i]) {
//                     count += 1;
//                 }
//             }
//             if (count > majorityCount) {
//                 return nums[i];
//             }
//         }
//         return -1;
//     }

//     public static void main(String[] args) {
//         int nums[] = { 2, 2, 1, 1, 1, 2, 2 };
//         System.out.println(majorityElement(nums));
//     }
// }

//Approach 2 : Divide and Conquer
public class Ass2 {
    public static int countRange(int[] nums, int num, int lo, int hi) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == num) {
                count++;
            }
        }
        return count;
    }

    public static int majorityElement(int[] nums, int lo, int hi) {
        // base case-the only element in an array of size 1 is the majority element
        if (lo == hi) {
            return nums[lo];
        }

        int mid = lo + (hi - lo) / 2;
        int left = majorityElement(nums, lo, mid);
        int right = majorityElement(nums, mid + 1, hi);

        if (left == right) {
            return left;
        }

        int leftCount = countRange(nums, left, lo, hi);
        int rightCount = countRange(nums, right, lo, hi);

        return leftCount > rightCount ? left : right;
    }

    public static void main(String[] args) {
        int nums[] = { 2, 2, 1, 1, 1, 2, 2 };
        System.out.println(majorityElement(nums, 0, nums.length - 1));
    }
}