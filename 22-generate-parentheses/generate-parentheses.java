class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list=new ArrayList<>();
        backtrack(n,0,0,"",list);
        return list;
    }
    public void backtrack(int n,int open,int close,String curr,List<String> list){
        if(curr.length()==2*n){
            list.add(curr);
            return ;
        }
        if(open<n){
            backtrack(n,open+1,close,curr+"(",list);
        }
        if(close<open){
            backtrack(n,open,close+1,curr+")",list);
        }
    }
}