class Solution {
    public long maximumProfit(int[] prices, int k) {
        int n=prices.length;
        long[][] dp=new long[k+3][3];
        for(int i=0;i<=k;i++){
            dp[i][1]=Long.MIN_VALUE/2;
            dp[i][2]=Long.MIN_VALUE/2;
        }
        for(int price:prices){
            long[][] next=new long[k+1][3];
            for(int i=0;i<=k;i++){
                next[i][0]=dp[i][0];
                next[i][1]=dp[i][1];
                next[i][2]=dp[i][2];
            }
            for(int i=0;i<k;i++){
                next[i][1]=Math.max(next[i][1],dp[i][0]-price);
                next[i][2]=Math.max(next[i][2],dp[i][0]+price);
            }
            for(int i=1;i<=k;i++){
                next[i][0]=Math.max(next[i][0],dp[i-1][1]+price);
                next[i][0]=Math.max(next[i][0],dp[i-1][2]-price);
            }
            dp=next;
        }
        return dp[k][0];
    }
}