class Solution {
    public String reverseOnlyLetters(String s) {
        List<Character> list=new ArrayList<>();
        char[] ch=s.toCharArray();
        for(char c:s.toCharArray()){
            if(Character.isLetter(c)){
                list.add(c);
            }
        }
        Collections.reverse(list);
        int j=0;
        for(int i=0;i<s.length();i++){
            if(Character.isLetter(ch[i])){
                ch[i]=list.get(j);
                j++;
            }
        }
        return new String(ch);
    }
}