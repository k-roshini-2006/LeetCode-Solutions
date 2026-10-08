class Solution {
    public int minSwaps(int[] nums) {
        int n=nums.length;
        int one=0;
        for(int i:nums){
            if(i==1){
                one++;
            }
        }
        if(one==0 || one==n){
            return 0;
        }
        int zero=0;
        int left=0;
        int minSwaps=Integer.MAX_VALUE;
        for(int right=0;right<n+one-1;right++){
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
                minSwaps=Math.min(minSwaps,zero);
            }
        }
        return minSwaps;
    }
}