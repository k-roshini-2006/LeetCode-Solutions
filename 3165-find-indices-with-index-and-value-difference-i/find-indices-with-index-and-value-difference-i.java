class Solution {
    public int[] findIndices(int[] nums, int indexDiff, int valueDiff) {
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(Math.abs(i-j)>=indexDiff && Math.abs(nums[i]-nums[j])>=valueDiff){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}