class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> list=new ArrayList<>();
        backtrack(1,n,k,new ArrayList<>(),list);
        return list;   
    }
    void backtrack(int index,int n,int k,List<Integer> curr,List<List<Integer>> list){
        if(curr.size()==k){
            list.add(new ArrayList<>(curr));
            return;
        }
        for(int i=index;i<=n;i++){
            curr.add(i);
            backtrack(i+1,n,k,curr,list);
            curr.remove(curr.size()-1);
        }
    }
}