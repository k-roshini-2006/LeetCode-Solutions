class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> mp=new HashMap<>();
        for(char ch:s.toCharArray()){
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }
        int length=0;
        boolean odd=false;
        for(Map.Entry<Character,Integer> entry:mp.entrySet()){
            length+=(entry.getValue()/2)*2;
            if(entry.getValue()%2==1){
                odd=true;
            }
        }
        return odd  ? length+1 : length;
    }
}