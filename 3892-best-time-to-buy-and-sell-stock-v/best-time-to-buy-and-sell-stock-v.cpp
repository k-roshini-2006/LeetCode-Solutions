class Solution {
public:
    long long maximumProfit(vector<int>& prices, int k) {
        int n=prices.size();
        vector<vector<long long>> dp(k+1,vector<long long>(3));
        for(int i=0;i<=k;i++){
            dp[i][1]=LLONG_MIN/2;
            dp[i][2]=LLONG_MIN/2;
        }
        for(int price:prices){
            vector<vector<long long>> next(k+1,vector<long long>(3));
            for(int i=0;i<=k;i++){
                next[i][0]=dp[i][0];
                next[i][1]=dp[i][1];
                next[i][2]=dp[i][2];
            }
            for(int i=0;i<k;i++){
                next[i][1]=max(next[i][1],dp[i][0]-price);
                next[i][2]=max(next[i][2],dp[i][0]+price);
            }
            for(int i=1;i<=k;i++){
                next[i][0]=max(next[i][0],dp[i-1][1]+price);
                next[i][0]=max(next[i][0],dp[i-1][2]-price);
            }
            dp=next;
        }
        return dp[k][0];
    }
};