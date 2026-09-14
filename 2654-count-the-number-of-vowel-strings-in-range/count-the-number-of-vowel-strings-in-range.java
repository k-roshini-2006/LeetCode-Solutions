class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int count=0;
        for(int i=left;i<=right;i++){
            if(startsAndEndsWithVowel(words[i])){
                count++;
            }
        }
        return count;
    }
    public boolean isVowel(char ch){
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
    }
    public boolean startsAndEndsWithVowel(String s){
        if(isVowel(s.charAt(0)) && isVowel(s.charAt(s.length()-1))){
            return true;
        }
        return false;
    }
}