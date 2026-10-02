class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int start=nums[i];
            while(i<nums.length-1 && nums[i]+1==nums[i+1]){
                i++;
            }
            int end=nums[i];
            if(start==end){
                list.add(String.valueOf(nums[i]));
            }
            else{
                list.add(start+"->"+end);
            }
        }
        return list;
    }
}