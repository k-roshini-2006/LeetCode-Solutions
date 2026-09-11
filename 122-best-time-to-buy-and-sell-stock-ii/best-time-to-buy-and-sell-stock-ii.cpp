class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int max=0;
        for(int i=1;i<prices.size();i++){
            int ans=prices[i]-prices[i-1];
            if(ans>0){
                max+=ans;
            }
        }
        return max;
    }
};