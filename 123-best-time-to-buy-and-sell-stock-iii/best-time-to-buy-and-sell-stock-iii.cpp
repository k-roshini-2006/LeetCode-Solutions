class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int buy1=INT_MIN;
        int sell1=0;
        int buy2=INT_MIN;
        int sell2=0;
        for(int i:prices){
            buy1=max(buy1,-i);
            sell1=max(sell1,buy1+i);
            buy2=max(buy2,sell1-i);
            sell2=max(sell2,buy2+i);
        }
        return sell2;
    }
};