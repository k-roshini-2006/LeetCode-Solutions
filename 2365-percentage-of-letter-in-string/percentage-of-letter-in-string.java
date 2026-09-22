class Solution {
    public int percentageLetter(String s, char letter) {
        HashMap<Character,Integer> mp=new HashMap<>();
        for(char ch:s.toCharArray()){
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }
        int pl=0;
        for(Map.Entry<Character,Integer> entry:mp.entrySet()){
            if(entry.getKey()==letter){
                pl=entry.getValue();
            }
        }
        int ans=(pl*100)/s.length();
        return ans;
    }
}