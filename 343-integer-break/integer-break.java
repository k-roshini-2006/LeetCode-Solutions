class Solution {
    public int integerBreak(int n) {
        int[] dp=new int[n+1];
        dp[1]=1;
        for(int i=2;i<=n;i++){
            for(int j=1;j<i;j++){
                int rem=i-j;
                int prod=j*Math.max(rem,dp[rem]);
                dp[i]=Math.max(dp[i],prod);
            }
        }
        return dp[n];
    }
}