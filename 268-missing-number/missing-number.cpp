class Solution {
public:
    int missingNumber(vector<int>& nums) {
        int total=0;
        for(int i:nums){
            total+=i;
        }
        int n=nums.size();
        int actual=n*(n+1)/2;
        return actual-total;
    }
};