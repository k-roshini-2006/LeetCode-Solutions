class Solution {
public:
    int percentageLetter(string s, char letter) {
        map<char,int> mp;
        for(char ch:s){
            mp[ch]++;
        }
        int pl=0;
        for(auto entry:mp){
            if(entry.first==letter){
                pl=entry.second;
            }
        }
        int ans=(pl*100)/s.length();
        return ans;
    }
};