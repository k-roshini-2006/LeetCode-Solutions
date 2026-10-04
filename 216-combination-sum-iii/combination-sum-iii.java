class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> list=new ArrayList<>();
        backtrack(k,n,1,new ArrayList<>(),list);
        return list;
    }
    public void backtrack(int k,int n,int start,List<Integer> curr,List<List<Integer>> list){
        if(n==0 && curr.size()==k){
            list.add(new ArrayList<>(curr));
            return;
        }
        if(n<0 || curr.size()>=k){
            return;
        }
        for(int i=start;i<=9;i++){
            curr.add(i);
            backtrack(k,n-i,i+1,curr,list);
            curr.remove(curr.size()-1);
        }
    }
}