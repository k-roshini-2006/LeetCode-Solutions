class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        String first="";
        String second="";
        String third="";
        for(char ch:firstWord.toCharArray()){
            first+=ch-'a';
        }
        for(char ch:secondWord.toCharArray()){
            second+=ch-'a';
        }
        for(char ch:targetWord.toCharArray()){
            third+=ch-'a';
        }
        int n=Integer.parseInt(first)+Integer.parseInt(second);
        return Integer.parseInt(third)==n;
    }
}