class Solution {
public:
    int characterReplacement(string s, int k) {
        unordered_map<int,int> mp;
        int maxLength=0;
        int maxFreq=0;
        int left=0;
        for(int right=0;right<s.length();right++){
            mp[s[right]]++;
            maxFreq=max(maxFreq,mp[s[right]]);
            while((right-left+1)-maxFreq>k){
                mp[s[left]]--;
                left++;
            }
            maxLength=max(maxLength,right-left+1);
        }
        return maxLength;
    }
};