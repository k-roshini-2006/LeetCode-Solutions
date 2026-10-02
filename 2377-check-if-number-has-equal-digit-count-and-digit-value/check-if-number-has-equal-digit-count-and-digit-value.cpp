class Solution {
public:
    bool digitCount(string num) {
        map<int,int> mp;
        for(char ch:num){
            mp[ch-'0']++;
        }
        for(int i=0;i<num.length();i++){
            if(mp[i]!=num[i]-'0'){
                return false;
            }
        }
        return true;
    }
};