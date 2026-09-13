class Solution {
public:
    int pivotInteger(int n) {
        vector<int> nums;
        for(int i=1;i<=n;i++){
            nums.push_back(i);
        }
        int total=0;
        for(int i:nums){
            total+=i;
        }
        int element=-1;
        int left=0;
        for(int i=0;i<nums.size();i++){
            int right=total-left-nums[i];
            if(left==right){
                element=nums[i];
            }
            left+=nums[i];
        }
        return element;
    }
};