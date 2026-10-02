class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        map<string,vector<string>> mp;
        for(int i=0;i<strs.size();i++){
            string word=strs[i];
            sort(word.begin(),word.end());
            if(mp.find(word)==mp.end()){
                mp[word]=vector<string>{};
            }
            mp[word].push_back(strs[i]);
        }
        vector<vector<string>> list;
        for(auto entry:mp){
            list.push_back(entry.second);
        }
        return list;
    }
};