class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int ttl = 0;
        int curMax = 0;
        int maxSum = Integer.MIN_VALUE;

        int curMin =  0;
        int minSum = Integer.MAX_VALUE;

        for(int n : nums){
            curMax = Math.max(n, curMax+n);
            maxSum = Math.max(maxSum, curMax);

            curMin = Math.min(n, curMin+n);
            minSum = Math.min(minSum, curMin);

            ttl+=n;
        }
        if(maxSum < 0)  return maxSum;
        return Math.max(maxSum, ttl-minSum);
    }
}