class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> list=new ArrayList<>();
        backtrack(n,k,1,new ArrayList<>(),list);
        return list;
    }
    public void backtrack(int n,int k,int index,List<Integer> curr,List<List<Integer>> list){
        if(n==0 && curr.size()==k){
            list.add(new ArrayList<>(curr));
            return;
        }
        if(n<0 ||curr.size()>=k){
            return;
        }
        for(int i=index;i<=9;i++){
            curr.add(i);
            backtrack(n-i,k,i+1,curr,list);
            curr.remove(curr.size()-1);
        }
    }
}