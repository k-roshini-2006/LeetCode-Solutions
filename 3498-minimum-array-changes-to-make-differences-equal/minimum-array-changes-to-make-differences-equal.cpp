class Solution {
public:
    int minChanges(vector<int>& nums, int k) {
        vector<int> diff(k+2);
        int n=nums.size();
        for(int i=0;i<n/2;i++){
            int a=min(nums[i],nums[n-1-i]);
            int b=max(nums[i],nums[n-1-i]);

            int currDiff=b-a;
            int maxReach=max(b,k-a);

            diff[0]+=2;
            diff[k+1]-=2;

            diff[0]-=1;
            diff[maxReach+1]+=1;

            diff[currDiff]-=1;
            diff[currDiff+1]+=1;
        }
        int change=INT_MAX;
        int prefix=0;
        for(int target=0;target<=k;target++){
            prefix+=diff[target];
            change=min(change,prefix);
        }
        return change;
    }
};