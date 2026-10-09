class Solution {
    public int minSwaps(int[] nums) {
        int n=nums.length;
        int one=0;
        for(int x:nums){
            if(x==1){
                one++;
            }
        }
        if(one==0 ||one ==n){
            return 0;
        }
        int zero=0;
        int left=0;
        int minSwap=Integer.MAX_VALUE;
        for(int right=0;right<one+n-1;right++){
            if(nums[right%n]==0){
                zero++;
            }
            if(right-left+1>one){
                if(nums[left%n]==0){
                    zero--;
                }
                left++;
            }
            if(right-left+1==one){
                minSwap=Math.min(minSwap,zero);
            }
        }
        return minSwap;
    }
}