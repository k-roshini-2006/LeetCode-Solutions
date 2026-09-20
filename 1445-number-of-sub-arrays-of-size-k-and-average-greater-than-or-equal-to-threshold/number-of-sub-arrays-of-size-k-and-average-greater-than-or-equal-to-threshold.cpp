class Solution {
public:
    int numOfSubarrays(vector<int>& nums, int k, int threshold) {
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        int count=0;
        if(sum/k>=threshold){
            count++;
        }
        for(int right=k;right<nums.size();right++){
            sum=sum-nums[right-k]+nums[right];
            if(sum/k>=threshold){
                count++;
            }
        }
        return count;
    }
};