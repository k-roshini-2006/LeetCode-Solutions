class Solution {
    public int calculate(String s) {
        int sign=1;
        int result=0;
        int num=0;
        Stack<Integer> st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(Character.isDigit(ch)){
                num=num*10+(ch-'0');
            }
            else if(ch=='+'){
                result+=sign*num;
                sign=1;
                num=0;
            }
            else if(ch=='-'){
                result+=sign*num;
                sign=-1;
                num=0;
            }
            else if(ch=='('){
                st.push(result);
                st.push(sign);
                sign=1;
                result=0;
            }
            else if(ch==')'){
                result+=sign*num;
                num=0;
                int oldSign=st.pop();
                int oldResult=st.pop();
                result=oldResult+oldSign*result;
            }
        }
        result+=sign*num;
        return result;
    }
}