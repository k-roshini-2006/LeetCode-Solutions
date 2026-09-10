class Solution {
public:
    int maxFrequencyElements(vector<int>& nums) {
        unordered_map<int,int> mp;
        for(int i:nums){
            mp[i]++;
        }
        int maxi=0;
        int total=0;
        vector<int> arr;
        for(auto entry:mp){
            if(entry.second>maxi){
                maxi=entry.second;
                total=entry.second;
            }
            else if(entry.second==maxi){
                total+=entry.second;
            }
        }
        return total;
    }
};