class Solution {
    public String simplifyPath(String path) {
        String[] str=path.split("/");
        Stack<String> st=new Stack<>();
        for(String s:str){
            if(s.equals("")||s.equals(".")){
                continue;
            }
            else if(s.equals("..")){
                if(!st.isEmpty()){
                    st.pop();
                }
            }
            else{
                st.push(s);
            }
        }
        StringBuilder sb=new StringBuilder();
        for(String s:st){
            sb.append("/");
            sb.append(s);
        }
        return sb.length()==0 ? "/" : sb.toString();
    }
}