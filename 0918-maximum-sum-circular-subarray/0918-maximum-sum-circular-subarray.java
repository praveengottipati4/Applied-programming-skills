class Solution {
    public int maxSubarraySumCircular(int[] nums) {

        int totalSum = 0;
        int maxSum = nums[0], currentMax = nums[0];
        int minSum = nums[0], currentMin = nums[0];

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            totalSum += num;

            if (i > 0) {
                currentMax = Math.max(num, currentMax + num);
                maxSum = Math.max(maxSum, currentMax);

                currentMin = Math.min(num, currentMin + num);
                minSum = Math.min(minSum, currentMin);
            }
        }

        if (maxSum < 0) return maxSum;

        return Math.max(maxSum, totalSum - minSum);
    }
}