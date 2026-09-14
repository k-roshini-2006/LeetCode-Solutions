class Solution {
public:
    bool isIsomorphic(string s, string t) {
        unordered_map<char,char> mp;
        for(int i=0;i<s.length();i++){
            char ch1=s[i];
            char ch2=t[i];
            if(mp.find(ch1)!=mp.end()){
                if(mp[ch1]!=ch2){
                    return false;
                }
            }
            else{
                for(auto entry:mp){
                    if(entry.second==ch2){
                        return false;
                    }
                }
                mp[ch1]=ch2;
            }
        }
        return true;
    }
};