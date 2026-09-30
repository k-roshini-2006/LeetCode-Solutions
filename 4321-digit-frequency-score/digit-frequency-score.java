class Solution {
    public int digitFrequencyScore(int n) {
        List<Integer> list=new ArrayList<>();
        int temp=n;
        while(temp>0){
            list.add(temp%10);
            temp/=10;
        }
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i:list){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        int sum=0;
        for(Map.Entry<Integer,Integer> entry:mp.entrySet()){
            sum+=(entry.getKey()*entry.getValue());
        }
        return sum;
    }
}