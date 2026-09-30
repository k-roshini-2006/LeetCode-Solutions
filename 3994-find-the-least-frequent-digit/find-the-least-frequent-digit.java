class Solution {
    public int getLeastFrequentDigit(int n) {
        List<Integer> list=new ArrayList<>();
        while(n>0){
            list.add(n%10);
            n/=10;
        }
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i:list){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        int min=Integer.MAX_VALUE;
        int mindigit=0;
        for(Map.Entry<Integer,Integer> entry:mp.entrySet()){
            if(entry.getValue()<min){
                min=entry.getValue();
                mindigit=entry.getKey();
            }
        }
        return mindigit;
    }
}