class Solution {
    public String reverseWords(String s) {
        String[] words=s.split(" ");
        int count=vowelCount(words[0]);
        for(int i=1;i<words.length;i++){
            if(vowelCount(words[i])==count){
                words[i]=new StringBuilder(words[i]).reverse().toString();
            }
        }
        String ans=String.join(" ",words);
        return ans;

    }
    int vowelCount(String s){
        int count=0;
        for(char ch:s.toCharArray()){
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                count++;
            }
        }
        return count;
    }
    
}