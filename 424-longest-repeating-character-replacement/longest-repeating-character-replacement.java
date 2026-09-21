class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> mp=new HashMap<>();
        int left=0;
        int maxLength=0;
        int maxFreq=0;
        for(int right=0;right<s.length();right++){
            mp.put(s.charAt(right),mp.getOrDefault(s.charAt(right),0)+1);
            maxFreq=Math.max(maxFreq,mp.get(s.charAt(right)));
            while((right-left+1)-maxFreq>k){
                mp.put(s.charAt(left),mp.get(s.charAt(left))-1);
                left++;
            }
            maxLength=Math.max(maxLength,right-left+1);
        }
        return maxLength;
    }
}