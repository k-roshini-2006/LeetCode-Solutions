class Solution {
public:
    int firstUniqueFreq(vector<int>& nums) {
        unordered_map<int,int> mp;
        for(int i:nums){
            mp[i]++;
        }
        vector<int> list;
        for(auto entry:mp){
            list.push_back(entry.second);
        }
        unordered_map<int,int> frq;
        for(int i:list){
            frq[i]++;
        }
        for(int i=0;i<nums.size();i++){
            int frequency=mp[nums[i]];
            if(frq[frequency]==1){
                return nums[i];
            }
        }
        return -1;
    }
};