class Solution {
public:
    bool uniformArray(vector<int>& nums) {
        int small=INT_MAX;
        int count=0;
        for(int i=0;i<nums.size();i++){
            if(nums[i]%2!=0){
                small=min(small,nums[i]);
                count++;
            }
        }
        if(count==nums.size()||count==0){
            return true;
        }
        for(int i:nums){
            if(i%2==0 && i<small){
                return false;
            }
        }
        return true;
    }
};