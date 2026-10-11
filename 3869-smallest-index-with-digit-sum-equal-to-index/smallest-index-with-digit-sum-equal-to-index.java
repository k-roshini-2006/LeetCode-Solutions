class Solution {
    public int smallestIndex(int[] nums) {
        int total=0;
        for(int i=0;i<nums.length;i++){
            int temp=nums[i];
            total=0;
            while(temp>0){
                int digit=temp%10;
                total+=digit;
                temp/=10;
            }
            if(total==i){
                return i;
            }
        }
        return -1;
    }
}