class Solution {
public:
    string makeGood(string s) {
        stack<char> st;
        for(char ch:s){
            if(!st.empty() && isBad(st.top(),ch)){
                st.pop();
            }
            else{
                st.push(ch);
            }
        }
        string sb;
        while(!st.empty()){
            sb+=st.top();
            st.pop();
        }
        reverse(sb.begin(),sb.end());
        return sb;
    }
    bool isBad(char a,char b){
        return tolower(a)==tolower(b) && a!=b;
    }
};