class Solution {
public:
    int maxSubarraySumCircular(vector<int>& nums) {
        int maxSum=INT_MIN,currMax=0;
        int minSum=INT_MAX,currMin=0;
        int total=0;
        for(int i=0;i<nums.size();i++){
            currMax+=nums[i];
            maxSum=max(maxSum,currMax);
            if(currMax<0){
                currMax=0;
            }
            currMin+=nums[i];
            minSum=min(minSum,currMin);
            if(currMin>0){
                currMin=0;
            }
            total+=nums[i];
        }
        if(maxSum<0){
            return maxSum;
        }
        int circularSum=total-minSum;
        return max(circularSum,maxSum);
    }
};