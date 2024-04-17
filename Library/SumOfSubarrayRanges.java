package Library;

public class SumOfSubarrayRanges {
    public static long subArrayRanges(int[] nums){
        long ans = 0;
        for(int i=0; i<nums.length; i++){
            int minV = nums[i];
            int maxV = nums[i];
            for(int j = i; j<nums.length; j++){
                maxV = Math.max(maxV, nums[j]);
                minV = Math.min(minV, nums[j]);
                ans += maxV - minV;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(subArrayRanges(nums));
    }
}
