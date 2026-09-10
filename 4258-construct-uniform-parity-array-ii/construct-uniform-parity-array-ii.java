class Solution {
    public boolean uniformArray(int[] nums) {
        int small=Integer.MAX_VALUE;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2!=0){
                small=Math.min(small,nums[i]);
                count++;
            }
        }
        if(count==nums.length||count==0){
            return true;
        }
        for(int i:nums){
            if(i%2==0 && i<small){
                return false;
            }
        }
        return true;
    }
}