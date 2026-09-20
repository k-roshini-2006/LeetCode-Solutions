class Solution {
    public int maxVowels(String s, int k) {
        int count=0;
        for(int i=0;i<k;i++){
            if(isVowel(s.charAt(i))){
                count++;
            }
        }
        int maxCount=count;
        for(int right=k;right<s.length();right++){
            if(isVowel(s.charAt(right-k))){
                count--;
            }
            if(isVowel(s.charAt(right))){
                count++;
            }
            maxCount=Math.max(maxCount,count);
        }
        return maxCount;
    }
    public boolean isVowel(char ch){
        return "AEIOUaeiou".indexOf(ch)!=-1;
    }
}