class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list=new ArrayList<>();
        backtrack(candidates,target,0,new ArrayList<>(),list);
        return list;
    }
    public void backtrack(int[] nums,int target,int index,List<Integer> curr,List<List<Integer>> list){
        if(target==0){
            list.add(new ArrayList<>(curr));
            return;
        }
        if(target<0){
            return;
        }
        for(int i=index;i<nums.length;i++){
            curr.add(nums[i]);
            backtrack(nums,target-nums[i],i,curr,list);
            curr.remove(curr.size()-1);
        }
    }
}