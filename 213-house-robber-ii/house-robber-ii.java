class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1){
            return nums[0];
        }
        int case1=solve(nums,0,n-2);
        int case2=solve(nums,1,n-1);
        return Math.max(case1,case2);
    }
    public int solve(int[] nums,int start,int end){
        int p1=0;
        int p2=0;
        for(int i=start;i<=end;i++){
            int take=nums[i]+p2;
            int skip=p1;
            int curr=Math.max(take,skip);
            p2=p1;
            p1=curr;
        }
        return p1;
    }
}