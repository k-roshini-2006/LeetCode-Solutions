class Solution {
public:
    vector<vector<int>> combine(int n, int k) {
      vector<vector<int>> list;
      vector<int> curr;
      backtrack(1,n,k,curr,list); 
      return list; 
    }
    void backtrack(int index,int n,int k,vector<int>& curr,vector<vector<int>>& list){
        if(curr.size()==k){
            list.push_back(vector<int>(curr));
            return;
        }
        for(int i=index;i<=n;i++){
            curr.push_back(i);
            backtrack(i+1,n,k,curr,list);
            curr.pop_back();
        }
    }
};