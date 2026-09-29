class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i:nums){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        int sum=0;
        for(Map.Entry<Integer,Integer> entry:mp.entrySet()){
            if(entry.getValue()%k==0){
                sum+=(entry.getKey()*entry.getValue());
            }
        }
        return sum;
    }
}