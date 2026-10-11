class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list=new ArrayList<>();
        int start=0;
        int end=0;
        for(int i=0;i<nums.length;i++){
            start=nums[i];
            while(i<nums.length-1 && nums[i]+1==nums[i+1]){
                i++;
            }
            end=nums[i];
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