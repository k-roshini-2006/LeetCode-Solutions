class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%nums.length;
        int[] ans=new int[n];
        System.arraycopy(nums,n-k,ans,0,k);
        System.arraycopy(nums,0,ans,k,n-k);
        for(int i=0;i<n;i++){
            nums[i]=ans[i];
        }
    }
}