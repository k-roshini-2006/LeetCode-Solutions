class Solution {
public:
    int findUnsortedSubarray(vector<int>& nums) {
        vector<int> copy(nums);
        int first=-1;
        int last=-1;
        sort(copy.begin(),copy.end());
        for(int i=0;i<nums.size();i++){
            if(nums[i]!=copy[i]){
                if(first==-1){
                    first=i;
                }
                last=i;
            }
        }
        return first==-1 ? 0 : last-first+1;
    }
};