class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        Arrays.sort(nums);
        for(int i:nums){
            if(i%2==0){
                mp.put(i,mp.getOrDefault(i,0)+1);
            }
        }
        int ans=-1;
        int max=0;
        for(int i:nums){
            if(i%2==0){
                if(mp.get(i)>max){
                    max=mp.get(i);
                    ans=i;
                }
            }
        }
        return ans;
    }
}