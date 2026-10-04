class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(candidates,target,0,new ArrayList<>(),list);
        return list;
    }
    public void backtrack(int[] candidates,int target,int start,List<Integer> curr,List<List<Integer>> list){
        if(target==0){
            list.add(new ArrayList<>(curr));
            return;
        }
        if(target<0){
            return;
        }
        for(int i=start;i<candidates.length;i++){
            if(i>start && candidates[i]==candidates[i-1]){
                continue;
            }
            if(candidates[i]>target){
                break;
            }
            curr.add(candidates[i]);
            backtrack(candidates,target-candidates[i],i+1,curr,list);
            curr.remove(curr.size()-1);
        }
    }
}