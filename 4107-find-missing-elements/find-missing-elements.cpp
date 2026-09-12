class Solution {
public:
    vector<int> findMissingElements(vector<int>& nums) {
        int n=nums.size();
        unordered_set<int> set;
        for(int i:nums){
            set.insert(i);
        }
        vector<int> list;
        sort(nums.begin(),nums.end());
        int min=nums[0];
        int max=nums[n-1];
        for(int i=min;i<=max;i++){
            if(!set.contains(i)){
                list.push_back(i);
            }
        }
        return list;
    }
};