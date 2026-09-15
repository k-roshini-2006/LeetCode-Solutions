class Solution {
public:
    bool wordPattern(string pattern, string s) {
        stringstream ss(s);
        string words;
        vector<string> parts;
        while(ss>>words){
            parts.push_back(words);
        }
        if(parts.size()!=pattern.length()){
            return false;
        }
        unordered_map<char,string> mp;
        for(int i=0;i<parts.size();i++){
            char ch=pattern[i];
            string word=parts[i];
            if(mp.find(ch)!=mp.end()){
                if(mp[ch]!=word){
                    return false;
                }
            }
            else{
                for(auto entry:mp){
                    if(entry.second==word){
                        return false;
                    }
                }
                mp[ch]=word;
            }

        }
        return true;
    }
};