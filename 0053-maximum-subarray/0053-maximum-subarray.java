public class Solution {

    public static int maxSubArray(int[] nums) {
        int maxSoFar = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            // Either extend the previous subarray or start new from current element
            currentSum = Math.max(nums[i], currentSum + nums[i]);

            // Update maximum found so far
            maxSoFar = Math.max(maxSoFar, currentSum);
        }

        return maxSoFar;
    }

    // Main method for testing
    public static void main(String[] args) {
        int[] nums1 = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums1)); // Output: 6

        int[] nums2 = {1};
        System.out.println(maxSubArray(nums2)); // Output: 1

        int[] nums3 = {5,4,-1,7,8};
        System.out.println(maxSubArray(nums3)); // Output: 23
    }
}