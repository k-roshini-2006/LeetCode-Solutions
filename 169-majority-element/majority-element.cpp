class Solution {
public:
    int majorityElement(vector<int>& nums) {
        unordered_map<int,int> mp;
        for(int i=0;i<nums.size();i++){
            mp[nums[i]]++;
        }
        int n=nums.size()/2;
        for(auto entry:mp){
            if(entry.second>n){
                return entry.first;
            }
        }
        return -1;
    }
};