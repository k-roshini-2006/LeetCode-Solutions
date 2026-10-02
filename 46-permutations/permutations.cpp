class Solution {
public:
    vector<vector<int>> permute(vector<int>& nums) {
        vector<vector<int>> list;
        vector<bool> used(nums.size());
        backtrack(nums,used,vector<int>{},list);
        return list;
    }
    void backtrack(vector<int>& nums,vector<bool>& used,vector<int> curr,vector<vector<int>>& list){
        if(curr.size()==nums.size()){
            list.push_back(vector<int>(curr));
        }
        for(int i=0;i<nums.size();i++){
            if(used[i]){
                continue;
            }
            curr.push_back(nums[i]);
            used[i]=true;
            backtrack(nums,used,curr,list);
            used[i]=false;
            curr.pop_back();
        }
    }
};