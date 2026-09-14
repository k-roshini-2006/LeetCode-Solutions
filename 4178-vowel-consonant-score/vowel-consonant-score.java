class Solution {
    public int vowelConsonantScore(String s) {
        s=s.replace(" ","");
        int v=0;
        int c=0;
        for(char ch:s.toCharArray()){
            if(!Character.isDigit(ch) && isVowel(ch)){
                v++;
            }
            else if(!Character.isDigit(ch) && !isVowel(ch)){
                c++;
            }
        }
        if(c>0){
            return Math.floorDiv(v,c);
        }
        else{
            return 0;
        }
    }
    public boolean isVowel(char ch){
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
    }
}
