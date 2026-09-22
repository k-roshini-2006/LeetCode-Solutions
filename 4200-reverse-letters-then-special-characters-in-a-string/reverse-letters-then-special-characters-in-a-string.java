class Solution {
    public String reverseByType(String s) {
        List<Character> letter=new ArrayList<>();
        List<Character> special=new ArrayList<>();
        char[] ch=s.toCharArray();
        for(char c:ch){
            if(Character.isLetter(c)){
                letter.add(c);
            }
            else{
                special.add(c);
            }
        }
        Collections.reverse(letter);
        Collections.reverse(special);
        int j=0;
        int k=0;
        for(int i=0;i<ch.length;i++){
            if(Character.isLetter(ch[i])){
                ch[i]=letter.get(j);
                j++;
            }
            else{
                ch[i]=special.get(k);
                k++;
            }
        }
        return new String(ch);
    }
}