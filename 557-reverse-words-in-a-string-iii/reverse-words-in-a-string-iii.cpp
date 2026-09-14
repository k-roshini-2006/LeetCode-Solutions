class Solution {
public:
    string reverseWords(string s) {
        stringstream ss(s);
        string word;
        vector<string> parts;
        while(ss>>word){
            parts.push_back(word);
        }
        for(int i=0;i<parts.size();i++){
            reverse(parts[i].begin(),parts[i].end());
        }
        string ans="";
        for(int i=0;i<parts.size();i++){
            ans+=parts[i];
            if(i<parts.size()-1){
                ans+=" ";
            }
        }
        return ans;
    }
};