class Solution {
public:
    int integerBreak(int n) {
        vector<int> dp(n+1);
        dp[1]=1;
        for(int i=2;i<=n;i++){
            for(int j=1;j<i;j++){
                int rem=i-j;
                int prod=j*max(rem,dp[rem]);
                dp[i]=max(dp[i],prod);
            }
        }
        return dp[n];
    }
};