class Solution {
public:
    int missingNumber(vector<int>& nums) {
        int n=nums.size();
        int total=0;
        int actual=0;
        for(int i:nums){
            total+=i;
        }
        actual=n*(n+1)/2;
        return actual-total;
    }
};