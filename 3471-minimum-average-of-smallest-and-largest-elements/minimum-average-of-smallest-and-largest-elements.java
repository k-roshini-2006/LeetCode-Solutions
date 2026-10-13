class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        double max=Integer.MAX_VALUE;
        int j=nums.length-1;
        for(int i=0;i<Math.floor(nums.length/2);i++){
            double avg=(double)(nums[i]+nums[j])/2;
            max=Math.min(max,avg);
            j--;
        }
        return max;
    }
}