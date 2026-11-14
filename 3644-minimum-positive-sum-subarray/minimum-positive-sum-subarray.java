class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int min=Integer.MAX_VALUE;
        for(int i=l;i<=r;i++){
            int curr=0;
            for(int j=0;j<i;j++){
                curr+=nums.get(j);
            }
            if(curr>0){
                min=Math.min(min,curr);
            }
        int low=0;
        int high=i;
        while(high<nums.size()){
            curr-=nums.get(low);
            curr+=nums.get(high);
            low++;
            high++;
            if(curr>0){
                min=Math.min(min,curr);
            }
        }
        }
        return min==Integer.MAX_VALUE ? -1 : min;
    }
}