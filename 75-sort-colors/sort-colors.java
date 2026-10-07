class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        quick(nums,0,n-1);
    }
    public void quick(int[] nums,int left,int right){
        if(left<right){
            int pivot=partition(nums,left,right);
            quick(nums,left,pivot-1);
            quick(nums,pivot+1,right);
        }
    }
    public int partition(int[] nums,int low,int high){
        int i=low;
        int j=high;
        int pivot=nums[low];
        while(i<j){
            if(i<high && nums[i]<=pivot){
                i++;
            }
            while(nums[j]>pivot){
                j--;
            }
            if(i<j){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
        }
        int temp=nums[j];
        nums[j]=nums[low];
        nums[low]=temp;
        return j;
    }
}