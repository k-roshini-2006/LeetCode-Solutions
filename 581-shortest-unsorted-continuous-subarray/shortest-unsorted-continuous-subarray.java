class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int n=nums.length;
        int[] copy =nums.clone();
        int first=-1;
        int last=-1;
        Arrays.sort(copy);
        for(int i=0;i<n;i++){
            if(nums[i]!=copy[i]){
                if(first==-1){
                    first=i;
                }
                last=i;
            }
        }
        if(first==-1){
            return 0;
        }
        else{
            return last-first+1;
        }
    }
}