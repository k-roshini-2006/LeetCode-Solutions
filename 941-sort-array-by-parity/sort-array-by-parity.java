class Solution {
    public int[] sortArrayByParity(int[] nums) {
        List<Integer> even=new ArrayList<>();
        List<Integer> odd=new ArrayList<>();
        for(int i:nums){
            if(i%2==0){
                even.add(i);
            }
            else{
                odd.add(i);
            }
        }
        List<Integer> list=new ArrayList<>();
        for(int i:even){
            list.add(i);
        }
        for(int i:odd){
            list.add(i);
        }
        int[] ans=new int[list.size()];
        for(int i=0;i<list.size();i++){
            ans[i]=list.get(i);
        }
        return ans;
    }
}