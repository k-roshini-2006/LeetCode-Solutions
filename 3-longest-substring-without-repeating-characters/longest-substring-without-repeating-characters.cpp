class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        unordered_set<int> set;
        int left=0;
        int maxi=0;
        for(int right=0;right<s.length();right++){
            while(set.contains(s[right])){
                set.erase(s[left]);
                left++;
            }
            set.insert(s[right]);
            maxi=max(maxi,right-left+1);
        }
        return maxi;
    }
};
