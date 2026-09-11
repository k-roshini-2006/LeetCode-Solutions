class Solution {
public:
    int maxProfit(int k, vector<int>& prices) {
        int n=prices.size();
        if(n==0||k==0){
            return 0;
        }
        if(k>=n/2){
            int profit=0;
            for(int i=1;i<n;i++){
                int ans=prices[i]-prices[i-1];
                if(ans>0){
                    profit+=ans;
                }
            }
            return profit;
        }
        vector<int> buy(k);
        vector<int> sell(k);
        for(int i=0;i<k;i++){
            buy[i]=INT_MIN;
        }
        for(int price:prices){
            for(int i=0;i<k;i++){
                if(i==0){
                    buy[i]=max(buy[i],-price);
                }
                else{
                    buy[i]=max(buy[i],sell[i-1]-price);
                }
                sell[i]=max(sell[i],buy[i]+price);
            }
        }
        return sell[k-1];
    }
};