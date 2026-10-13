class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        backtrack(nums,0,new ArrayList<>(),list);
        return list;
    }
    public void backtrack(int[] nums,int index,List<Integer> curr,List<List<Integer>> list){
        list.add(new ArrayList<>(curr));
        for(int i=index;i<nums.length;i++){
            curr.add(nums[i]);
            backtrack(nums,i+1,curr,list);
            curr.remove(curr.size()-1);
        }
    }
}