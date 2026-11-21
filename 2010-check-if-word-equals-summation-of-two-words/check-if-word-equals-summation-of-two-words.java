class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        return numValue(firstWord)+numValue(secondWord)==numValue(targetWord);
    }
    public int numValue(String s){
        String val="";
        for(char ch:s.toCharArray()){
            val+=ch-'a';
        }
        return Integer.parseInt(val);
    }
}