class Solution {
public:
    int evalRPN(vector<string>& tokens) {
        stack<int> st;
        int a=0;
        int b=0;
        for(string s:tokens){
            if(s=="+"){
                b=st.top();st.pop();
                a=st.top();st.pop();
                st.push(a+b);   
            }
            else if(s=="-"){
                b=st.top();st.pop();
                a=st.top();st.pop();
                st.push(a-b);
            }
            else if(s=="*"){
                b=st.top();st.pop();
                a=st.top();st.pop();
                st.push(a*b);
            }
            else if(s=="/"){
                b=st.top();st.pop();
                a=st.top();st.pop();
                st.push(a/b);
            }
            else{
                st.push(stoi(s));
            }
        }
        return st.top();
    }
};