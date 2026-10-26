class Solution {
public:
    vector<string> stringMatching(vector<string>& words) {
        unordered_set<string> set;
        for(int i=0;i<words.size();i++){
            for(int j=0;j<words.size();j++){
                if(i!=j && words[i].find(words[j]) != string::npos){
                    set.insert(words[j]);
                }
            }
        }
        vector<string> ans;
        for(string s:set){
            ans.push_back(s);
        }
        return ans;
    }
};