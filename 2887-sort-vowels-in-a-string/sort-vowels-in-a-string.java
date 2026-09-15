class Solution {
    public String sortVowels(String s) {
       List<Character> vowel=new ArrayList<>();
        for(char ch:s.toCharArray()){
            if(isVowel(ch)){
                vowel.add(ch);
            }
        } 
        Collections.sort(vowel);
        int j=0;
        char[] ch=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(isVowel(ch[i])){
                ch[i]=vowel.get(j);
                j++;
            }
        }
        return new String(ch);

    }
    public boolean isVowel(char ch){
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U';
    }
}