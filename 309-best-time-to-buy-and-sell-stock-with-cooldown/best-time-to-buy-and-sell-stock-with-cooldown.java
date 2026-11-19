class Solution {
    public int maxProfit(int[] prices) {
        int hold=-prices[0];
        int sold=0,rest=0;
        for(int i=1;i<prices.length;i++){
            int pHold=hold;
            int pSold=sold;
            int pRest=rest;
            hold=Math.max(pHold,pRest-prices[i]);
            sold=pHold+prices[i];
            rest=Math.max(pRest,pSold);
        }
        return Math.max(sold,rest);
    }
}