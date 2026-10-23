class Solution {
public:
    bool isMonotonic(vector<int>& nums) {
        vector<int> asc(nums);
        sort(asc.begin(),asc.end());
        vector<int> desc(nums);
        sort(desc.begin(),desc.end(),greater<int>());
        return nums==asc || nums==desc;
    }
};