class Solution {
    public int firstUniqueFreq(int[] nums) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
       List<Integer> list=new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry:mp.entrySet()){
            list.add(entry.getValue());
        }
        HashMap<Integer,Integer> f=new HashMap<>();
        for(int i=0;i<list.size();i++){
            f.put(list.get(i),f.getOrDefault(list.get(i),0)+1);
        }
        for(int i=0;i<nums.length;i++){
            int freq=mp.get(nums[i]);
            if(f.get(freq)==1){
                return nums[i];
            }
        }
        return -1;
    }
}