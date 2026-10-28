class Solution {
    public int minimizeArrayValue(int[] nums) {
        long sum=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int avg=(int)((sum+i)/(i+1));
            max=Math.max(max,avg);
        }
        return max;
    }
}