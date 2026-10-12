class Solution {
    public String getPermutation(int n, int k) {
        boolean[] used=new boolean[n+1];
        List<String> list=new ArrayList<>();
        backtrack(n,used,new StringBuilder(),list);
        return list.get(k-1);
    }
    public void backtrack(int n , boolean[] used,StringBuilder curr,List<String> list){
        if(curr.length()==n){
            list.add(curr.toString());
            return;
        }
        for(int i=1;i<=n;i++){
            if(used[i]){
                continue;
            }
            curr.append(i);
            used[i]=true;
            backtrack(n,used,curr,list);
            used[i]=false;
            curr.deleteCharAt(curr.length()-1);
        }
    }
}