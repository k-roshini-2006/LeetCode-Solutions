class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        int n=s.length();
        int left=0;
        unordered_set<char> set;
        int maxi=0;
        for(int right=0;right<n;right++){
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