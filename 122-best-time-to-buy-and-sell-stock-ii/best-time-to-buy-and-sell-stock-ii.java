class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        for(int i=1;i<prices.length;i++){
            int ans=prices[i]-prices[i-1];
            if(ans>0){
                max+=ans;
            }
        }
        return max;
    }
}