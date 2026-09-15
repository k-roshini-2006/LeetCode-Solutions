class Solution {
    public String removeDuplicateLetters(String s) {
        Stack<Character> st=new Stack<>();
        int[] lastIndex=new int[26];
        for(int i=0;i<s.length();i++){
            lastIndex[s.charAt(i)-'a']=i;
        }
        boolean[] visited=new boolean[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(visited[ch-'a']){
                continue;
            }
            while(!st.isEmpty() && st.peek()>ch && lastIndex[st.peek()-'a']>i){
                visited[st.pop()-'a']=false;
            }
            st.push(ch);
            visited[ch-'a']=true;
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}