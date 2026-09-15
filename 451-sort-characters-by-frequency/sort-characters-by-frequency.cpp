class Solution {
public:
    string frequencySort(string s) {
        map<char,int> mp;
        for(char ch:s){
            mp[ch]++;
        }
        sort(s.begin(),s.end(),[&](int a,int b){
            if(mp[a]!=mp[b]){
                return mp[a]>mp[b];
            }
            return a<b;
        });
        return s;
    }
};