class Solution {
public:
    string removeOuterParentheses(string s) {
        string sb;
        stack<char> st;
        for(char ch:s){
            if(ch=='('){
                if(!st.empty()){
                    sb+=ch;
                }
                st.push(ch);
            }
            else{
                st.pop();
                if(!st.empty()){
                    sb+=ch;
                }
            }
        }
        return sb;
    }
};