class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        int total=0;
        int max=0;
        for(Map.Entry<Integer,Integer> entry:mp.entrySet()){
            if(entry.getValue()>max){
                max=entry.getValue();
                total=entry.getValue();
            }
            else if(entry.getValue()==max){
                total+=entry.getValue();
            }
        }
        return total;
    }
}