class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> list=new ArrayList<>();
        backtrack(n,k,1,new ArrayList<>(),list);
        return list;
    }
    public void backtrack(int n,int k,int index,List<Integer> curr,List<List<Integer>> list){
        if(curr.size()==k){
            list.add(new ArrayList<>(curr));
            return;
        }
        for(int i=index;i<=n;i++){
            curr.add(i);
            backtrack(n,k,i+1,curr,list);
            curr.remove(curr.size()-1);
        }
    }
}