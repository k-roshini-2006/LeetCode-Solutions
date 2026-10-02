class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        List<Integer> list=new ArrayList<>();
        for(int i:nums){
            while(i>0){
                list.add(i%10);
                i/=10;
            }
        }
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i:list){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        if(mp.size()==0){
            return 0;
        }
        for(int i=0;i<mp.size();i++){
            if(mp.containsKey(digit)){
                return mp.get(digit);
            }
        }
        return 0;
    }
}