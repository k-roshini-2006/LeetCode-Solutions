class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int maxSum=Integer.MIN_VALUE,currMax=0;
        int minSum=Integer.MAX_VALUE,currMin=0;
        int total=0;
        for(int i=0;i<nums.length;i++){
            currMax+=nums[i];
            maxSum=Math.max(maxSum,currMax);
            if(currMax<0){
                currMax=0;
            }
            currMin+=nums[i];
            minSum=Math.min(minSum,currMin);
            if(currMin>0){
                currMin=0;
            }
            total+=nums[i];
        }
        if(maxSum<0){
            return maxSum;
        }
        int circularSum=total-minSum;
        return Math.max(maxSum,circularSum);
    }
}