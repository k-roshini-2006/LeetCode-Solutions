class Solution {
public:
    vector<string> generateParenthesis(int n) {
        vector<string> list;
        backtrack(n,0,0,"",list);
        return list;
    }
    void backtrack(int n,int open,int close,string curr,vector<string>& list){
        if(curr.length()==2*n){
            list.push_back(curr);
            return;
        }
        if(open<n){
            backtrack(n,open+1,close,curr+"(",list);
        }
        if(close<open){
            backtrack(n,open,close+1,curr+")",list);
        }
    }
};