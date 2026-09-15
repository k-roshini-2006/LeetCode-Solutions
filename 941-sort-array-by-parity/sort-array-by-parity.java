class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n=nums.length;
        List<Integer> evenlist=new ArrayList<>();
        List<Integer> oddlist=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(nums[i]%2==0){
                evenlist.add(nums[i]);
            }
            else{
                oddlist.add(nums[i]);
            }
        }
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<evenlist.size();i++){
            list.add(evenlist.get(i));
        }
         for(int i=0;i<oddlist.size();i++){
            list.add(oddlist.get(i));
        }
        int[] result=new int[n];
        for(int i=0;i<n;i++){
            result[i]=list.get(i);
        }

        return result;
    }
}