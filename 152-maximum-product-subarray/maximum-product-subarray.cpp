class Solution {
public:
    int maxProduct(vector<int>& nums) {
        int minProduct=nums[0];
        int maxProduct=nums[0];
        int result=nums[0];
        for(int i=1;i<nums.size();i++){
            if(nums[i]<0){
                int temp=maxProduct;
                maxProduct=minProduct;
                minProduct=temp;
            }
            maxProduct=max(nums[i],nums[i]*maxProduct);
            minProduct=min(nums[i],nums[i]*minProduct);
            result=max(result,maxProduct);
        }
        return result;
    }
};