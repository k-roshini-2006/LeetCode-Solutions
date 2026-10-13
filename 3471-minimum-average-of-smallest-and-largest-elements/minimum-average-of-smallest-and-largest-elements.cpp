class Solution {
public:
    double minimumAverage(vector<int>& nums) {
        sort(nums.begin(),nums.end());
        double mini=INT_MAX;
        int j=nums.size()-1;
        for(int i=0;i<floor(nums.size()/2);i++){
                double avg = (double) (nums[i]+nums[j])/2;
                mini=min(mini,avg);
                j--;
        }
        return mini;
    }
};