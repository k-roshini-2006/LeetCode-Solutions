class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int sum=0;
        for(int i:nums){
            sum+=i;
        }
        if(Math.abs(target)>sum){
            return 0;
        }
        if((sum+target)%2 != 0){
            return 0;
        }
        int target2=(sum+target)/2;
        int[] dp=new int[target2+1];
        dp[0]=1;
        for(int num:nums){
            for(int i=target2;i>=num;i--){
                dp[i]+=dp[i-num];
            }
        }
        return dp[target2];
    }
}