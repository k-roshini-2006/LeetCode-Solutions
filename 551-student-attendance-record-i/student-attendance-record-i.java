class Solution {
    public boolean checkRecord(String s) {
        HashMap<Character,Integer> mp=new HashMap<>();
        for(char ch:s.toCharArray()){
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }
        if(mp.containsKey('A') && mp.get('A')>=2){
            return false;
        }
        int count=0;
        for(int i=1;i<s.length()-1;i++){
            if(s.charAt(i-1)=='L' && s.charAt(i)=='L' && s.charAt(i+1)=='L'){
                count++;
            }
        }
        if(count>0){
            return false;
        }
        return true;
    }
}