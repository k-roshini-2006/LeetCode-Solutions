class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        HashSet<Integer> set=new HashSet<>();
        for(int i:arr){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        for(int i:mp.keySet()){
            if(set.contains(mp.get(i))){
                return false;
            }
            set.add(mp.get(i));
        }
        return true;
    }
}