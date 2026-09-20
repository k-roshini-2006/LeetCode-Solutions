class Solution {
    public int maximumStrongPairXor(int[] nums) {
        int max=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            int temp=nums[i];
            for(int j=0;j<n;j++){
                if(Math.abs(temp-nums[j])<=Math.min(temp,nums[j])){
                    max=Math.max(max,temp^nums[j]);
                }
            }
        }
        return max;
    }
}