class Solution {
    public int firstUniqueFreq(int[] nums) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i:nums){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        List<Integer> list=new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry:mp.entrySet()){
            list.add(entry.getValue());
        }
        HashMap<Integer,Integer> frq=new HashMap<>();
        for(int i:list){
            frq.put(i,frq.getOrDefault(i,0)+1);
        }
        for(int i=0;i<nums.length;i++){
            int frequency=mp.get(nums[i]);
            if(frq.get(frequency)==1){
                return nums[i];
            }
        }
        return -1;
    }
}