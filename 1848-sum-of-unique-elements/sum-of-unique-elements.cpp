class Solution {
public:
    int sumOfUnique(vector<int>& nums) {
        unordered_map<int,int> mp;
        for(int i:nums){
            mp[i]++;
        }
        int sum=0;
        for(auto entry:mp){
            if(entry.second==1){
                sum+=entry.first;
            }
        }
        return sum;
    }
};