class Solution {
public:
    vector<vector<int>> combinationSum2(vector<int>& candidates, int target) {
        vector<vector<int>> list;
        sort(candidates.begin(),candidates.end());
        backtrack(candidates,target,0,vector<int>{},list);
        return list;
    }
    void backtrack(vector<int>& nums,int target,int start,vector<int> curr,vector<vector<int>>& list){
        if(target==0){
            list.push_back(vector<int>(curr));
            return;
        }
        if(target<0){
            return;
        }
        for(int i=start;i<nums.size();i++){
            if(i>start && nums[i]==nums[i-1]){
                continue;
            }
            if(nums[i]>target){
                break;
            }
            curr.push_back(nums[i]);
            backtrack(nums,target-nums[i],i+1,curr,list);
            curr.pop_back();
        }
    }
};