class Solution {
    public String firstPalindrome(String[] words) {
        String ans="";
        for(int i=0;i<words.length;i++){
            if(isPalindrome(words[i])){
                ans=words[i];
                break;
            }
        }
        return ans;
    }
    public boolean isPalindrome(String s){
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        return s.equals(sb.toString());
    }
}