class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()){
            return false;
        }
        HashMap<Character,Integer> mp1=new HashMap<>();
        for(char ch:s1.toCharArray()){
            mp1.put(ch,mp1.getOrDefault(ch,0)+1);
        }
        int left=0;
        HashMap<Character,Integer> mp2=new HashMap<>();
        for(int right=0;right<s2.length();right++){
            mp2.put(s2.charAt(right),mp2.getOrDefault(s2.charAt(right),0)+1);
            while(right-left+1>s1.length()){
                mp2.put(s2.charAt(left),mp2.get(s2.charAt(left))-1);
                if(mp2.get(s2.charAt(left))==0){
                    mp2.remove(s2.charAt(left));
                }
                left++;
            }
            if(mp1.equals(mp2)){
                return true;
            }
        }
        return false;
    }
}