class Solution {
public:
    vector<vector<int>> combinationSum(vector<int>& candidates, int target) {
        vector<vector<int>> list;
        backtrack(candidates,target,0,vector<int>{},list);
        return list;
    }
    void backtrack(vector<int>& nums,int target,int start,vector<int> curr,vector<vector<int>> &list){
        if(target==0){
            list.push_back(vector<int>(curr));
            return;
        }
        if(target<0){
            return;
        }
        for(int i=start;i<nums.size();i++){
            curr.push_back(nums[i]);
            backtrack(nums,target-nums[i],i,curr,list);
            curr.pop_back();
        }
    }
};