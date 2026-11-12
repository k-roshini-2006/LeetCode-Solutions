class Solution {
    public int deleteAndEarn(int[] nums) {
        int max=0;
        for(int i:nums){
            max=Math.max(max,i);
        }
        int[] p=new int[max+1];
        for(int i:nums){
            p[i]+=i;
        }
        int[] dp=new int[max+1];
        dp[0]=p[0];
        if(max>=1){
            dp[1]=Math.max(p[0],p[1]);
        }
        for(int i=2;i<=max;i++){
            int take=p[i]+dp[i-2];
            int skip=dp[i-1];
            dp[i]=Math.max(take,skip);
        }
        return dp[max];
    }
}