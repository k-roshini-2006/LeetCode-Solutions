class Solution {
public:
    int calculate(string s) {
        long long result=0;
        int sign=1;
        long long  num=0;
        stack<long long> st;
        for(int i=0;i<s.length();i++){
            char ch=s[i];
            if(isdigit(ch)){
                num=num*10+(ch-'0');
            }
            else if(ch=='+'){
                result+=sign*num;
                num=0;
                sign=1;
            }
            else if(ch=='-'){
                result+=sign*num;
                num=0;
                sign=-1;
            }
            else if(ch=='('){
                st.push(result);
                st.push(sign);
                result=0;
                sign=1;
            }
            else if(ch==')'){
                result+=sign*num;
                num=0;
                long long oldSign=st.top();st.pop();
                long long oldResult=st.top();st.pop();
                result=oldResult+oldSign*result;
            }
        }
        result+=sign*num;
        return result;
    }
};