class Solution {
public:
    int singleNumber(vector<int>& nums) {
        map<int,int> mp;
        for(int i:nums){
            mp[i]++;
        }
        for(auto entry:mp){
            if(entry.second==1){
                return entry.first;
            }
        }
        return -1;
    }
};