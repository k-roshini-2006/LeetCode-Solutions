class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int[] copy=nums.clone();
        Arrays.sort(copy);
        int first=-1;
        int last=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=copy[i]){
                if(first==-1){
                    first=i;
                }
                last=i;
            }
        }
        return first==-1 ? 0 : last-first+1;
    }
}