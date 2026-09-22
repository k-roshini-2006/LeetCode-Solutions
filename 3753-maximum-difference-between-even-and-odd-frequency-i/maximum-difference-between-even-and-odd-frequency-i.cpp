class Solution {
public:
    int maxDifference(string s) {
        map<int,int> mp;
        for(char ch:s){
            mp[ch]++;
        }
        int minEven=INT_MAX;
        int maxOdd=INT_MIN;
        for(auto entry:mp){
            if(entry.second%2==0){
                minEven=min(minEven,entry.second);
            }
            else{
                maxOdd=max(maxOdd,entry.second);
            }
        }
        return maxOdd-minEven;
    }
};