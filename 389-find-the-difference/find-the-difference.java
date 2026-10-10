class Solution {
    public char findTheDifference(String s, String t) {
        char r=' ';
        for(char ch:s.toCharArray()){
            r^=ch;
        }
        for(char ch:t.toCharArray()){
            r^=ch;
        }
        return Character.toLowerCase(r);
    }
}