class Solution {
public:
    vector<vector<int>> combinationSum3(int k, int n) {
        vector<vector<int>> list;
        backtrack(k,n,1,vector<int>{},list);
        return list;
    }
    void backtrack(int k,int target,int index,vector<int> curr,vector<vector<int>>& list){
        if(target==0 && curr.size()==k){
            list.push_back(vector<int>(curr));
            return;
        }
        if(target<0 || curr.size()>=k){
            return;
        }
        for(int i=index;i<=9;i++){
            curr.push_back(i);
            backtrack(k,target-i,i+1,curr,list);
            curr.pop_back();
        }
    }
};