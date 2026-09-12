class Solution {
    public int maxProfit(int k, int[] prices) {
        int n=prices.length;
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
        int[] buy=new int[k];
        int[] sell=new int[k];
        for(int i=0;i<k;i++){
            buy[i]=Integer.MIN_VALUE;
        }
        for(int price:prices){
            for(int i=0;i<k;i++){
                if(i==0){
                    buy[i]=Math.max(buy[i],-price);
                }
                else{
                    buy[i]=Math.max(buy[i],sell[i-1]-price);
                }
                sell[i]=Math.max(sell[i],buy[i]+price);
            }
        }
        return sell[k-1];
    }

}