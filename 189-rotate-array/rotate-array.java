class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        int[] arr=new int[n];
        k=k%n;
        System.arraycopy(nums,n-k,arr,0,k);
        System.arraycopy(nums,0,arr,k,n-k);
        for(int i=0;i<nums.length;i++){
            nums[i]=arr[i];
        }
    }
}