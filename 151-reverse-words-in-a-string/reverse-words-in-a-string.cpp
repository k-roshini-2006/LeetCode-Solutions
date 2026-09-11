class Solution {
public:
    string reverseWords(string s) {
        stack<string> st;
        stringstream ss(s);
        vector<string> parts;
        string word;
        while(ss>>word){
            parts.push_back(word);
        }
        reverse(parts.begin(),parts.end());
        string ans;
        for(int i=0;i<parts.size();i++){
            ans+=parts[i];
            if(i<parts.size()-1){
                ans+=" ";
            }
        }
        return ans;
    }
};