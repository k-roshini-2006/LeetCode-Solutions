class Solution {
public:
    string removeDuplicates(string s, int k) {
        stack<vector<int>> st;
        for(char ch:s){
            if(!st.empty() && st.top()[0]==ch){
                st.top()[1]++;
                if(st.top()[1]==k){
                    st.pop();
                }
            }
            else{
                st.push(vector<int>{ch,1});
            }
        }
        string ans;
        while(!st.empty()){
            vector<int> pair=st.top();
            st.pop();
            for(int i=0;i<pair[1];i++){
                ans+=(char)pair[0];
            }
        }
        reverse(ans.begin(),ans.end());
        return ans;
    }
};