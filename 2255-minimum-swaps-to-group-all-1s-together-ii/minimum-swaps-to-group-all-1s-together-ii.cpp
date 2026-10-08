class Solution {
public:
    int minSwaps(vector<int>& nums) {
        int one=0;
        int n=nums.size();
        for(int i:nums){
            if(i==1){
                one++;
            }
        }
        if(one==0||one==n){
            return 0;
        }
        int zero=0;
        int minSwap=INT_MAX;
        int left=0;
        for(int right=0;right<n+one-1;right++){
            if(nums[right%n]==0){
                zero++;
            }
            if(right-left+1>one){
                if(nums[left%n]==0){
                    zero--;
                }
                left++;
            }
            if(right-left+1==one){
                minSwap=min(minSwap,zero);
            }
        }
        return minSwap;
    }
};