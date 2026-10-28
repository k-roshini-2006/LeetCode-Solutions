class Solution {
public:
    int minimizeArrayValue(vector<int>& nums) {
        int maxi=0;
        long sum=0;
        for(int i=0;i<nums.size();i++){
            sum+=nums[i];
            int avg=(int)((sum+i)/(i+1));
            maxi=max(maxi,avg);
        }
        return maxi;
    }
};