class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        boolean[] used=new boolean[nums.length];
        backtrack(nums,used,new ArrayList<>(),list);
        return list;
    }
    public void backtrack(int[] nums,boolean[] used,List<Integer> curr,List<List<Integer>> list){
        if(curr.size()==nums.length){
            list.add(new ArrayList<>(curr));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(used[i]){
                continue;
            }
            curr.add(nums[i]);
            used[i]=true;
            backtrack(nums,used,curr,list);
            used[i]=false;
            curr.remove(curr.size()-1);
        }
    }
}