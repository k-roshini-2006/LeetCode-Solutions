class Solution {
public:
    string removeDuplicateLetters(string s) {
        vector<int> lastIndex(26);
        stack<int> st;
        vector<bool> visited(26);
        for(int i=0;i<s.length();i++){
            lastIndex[s[i]-'a']=i;
        }
        for(int i=0;i<s.length();i++){
            char ch=s[i];
            if(visited[ch-'a']){
                continue;
            }
            while(!st.empty() && st.top()>ch && lastIndex[st.top()-'a']>i){
               visited[st.top()-'a']=false;
               st.pop();
            }
            st.push(ch);
            visited[ch-'a']=true;
        }
        string sb;
        while(!st.empty()){
            sb+=st.top();
            st.pop();
        }
        reverse(sb.begin(),sb.end());
        return sb;
    }
};