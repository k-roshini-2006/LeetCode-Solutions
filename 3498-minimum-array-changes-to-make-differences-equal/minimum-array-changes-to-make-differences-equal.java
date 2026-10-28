class Solution {
    public int minChanges(int[] nums, int k) {
        int[] diff=new int[k+2];
        int n=nums.length;
        for(int i=0;i<n/2;i++){
            int a=Math.min(nums[i],nums[n-1-i]);
            int b=Math.max(nums[i],nums[n-1-i]);
            int currDiff=b-a;
            int maxReach=Math.max(b,k-a);
            diff[0]+=2;
            diff[k+1]-=2;

            diff[0]-=1;
            diff[maxReach+1]+=1;

            diff[currDiff]-=1;
            diff[currDiff+1]+=1;
            
        }
        int change=Integer.MAX_VALUE;
        int prefix=0;
        for(int target=0;target<=k;target++){
            prefix+=diff[target];
            change=Math.min(change,prefix);
        }
        return change;
    }
}