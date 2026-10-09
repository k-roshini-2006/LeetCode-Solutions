class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        int n=nums.length;
        while(k>0){
            int minIndex=0;
            for(int i=0;i<nums.length;i++){
                if(nums[i]<nums[minIndex]){
                    minIndex=i;
                }
            }
            nums[minIndex]=-nums[minIndex];
            k--;
        }
        int sum=0;
        for(int i:nums){
            sum+=i;
        }
        return sum;
    }
}