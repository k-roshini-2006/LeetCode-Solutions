class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i:nums){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        int sum=0;
        for(Map.Entry<Integer,Integer> entry:mp.entrySet()){
            if(entry.getValue()==1){
                sum+=entry.getKey();
            }
        }
        return sum;
    }
}