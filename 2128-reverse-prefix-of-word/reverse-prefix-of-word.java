class Solution {
    public String reversePrefix(String word, char ch) {
        int k=word.indexOf(ch);
        if(k==-1){
            return word;
        }
        StringBuilder sb=new StringBuilder(word.substring(0,k+1));
        sb.reverse();
        return sb.toString()+word.substring(k+1);
    }
}