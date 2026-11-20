class Solution {
    public int maxProfit(int[] price, int fee) {
        int n=price.length;
        if(n<=1){
            return 0;
        }
        int[] buy=new int[n];
        int[] sell=new int[n];
        buy[0]=-price[0];
        for(int i=1;i<n;i++){
            buy[i]=Math.max(buy[i-1],sell[i-1]-price[i]);
            sell[i]=Math.max(sell[i-1],buy[i-1]+price[i]-fee);
        }
        return sell[n-1];
    }
}