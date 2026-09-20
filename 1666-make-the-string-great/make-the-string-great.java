class Solution {
    public String makeGood(String s) {
        Stack<Character> st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(!st.isEmpty() && isBad(st.peek(),ch)){
                st.pop();
            }
            else{
                st.push(ch);
            }
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
    public boolean isBad(char a,char b){
        return a!=b && Character.toLowerCase(a)==Character.toLowerCase(b);
    }
}