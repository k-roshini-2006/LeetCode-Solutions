class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> list=new ArrayList<>();
        for(int i:nums){
            if(i<pivot){
                list.add(i);
            }
        }
        for(int i:nums){
            if(i==pivot){
                list.add(i);
            }
        }
        for(int i:nums){
            if(i>pivot){
                list.add(i);
            }
        }
        int[] ans=new int[list.size()];
        for(int i=0;i<list.size();i++){
            ans[i]=list.get(i);
        }
        return ans;
    }
}