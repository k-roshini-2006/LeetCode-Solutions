class Solution {
public:
    vector<int> dailyTemperatures(vector<int>& temp) {
        stack<int> st;
        int n=temp.size();
         vector<int> ans(n);
        for(int i=n-1;i>=0;i--){
            int curr=i;
            while(!st.empty() && temp[curr]>=temp[st.top()]){
                st.pop();
            }
            if(!st.empty()){
                int nge=st.top();
                ans[i]=nge-curr;
            }
            st.push(i);
        }
        return ans;
    }
};