class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int n=prices.size();
        int hold=-prices[0];
        int sold=0,rest=0;
        for(int i=1;i<n;i++){
            int pHold=hold;
            int pSold=sold;
            int pRest=rest;
            hold=max(pHold,pRest-prices[i]);
            sold=pHold+prices[i];
            rest=max(pRest,pSold);
        }
        return max(sold,rest);
    }
};