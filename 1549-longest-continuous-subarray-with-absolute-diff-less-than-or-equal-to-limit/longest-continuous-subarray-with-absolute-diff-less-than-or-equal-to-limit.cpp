class Solution {
public:
    int longestSubarray(vector<int>& nums, int limit) {
        deque<int> maxi;
        deque<int> mini;
        int left=0;
        int maxLength=0;
        for(int right=0;right<nums.size();right++){
            while(!maxi.empty() && nums[maxi.back()]<nums[right]){
                maxi.pop_back();
            }
            maxi.push_back(right);
            while(!mini.empty() && nums[mini.back()]>nums[right]){
                mini.pop_back();
            }
            mini.push_back(right);
            while(nums[maxi.front()]-nums[mini.front()]>limit){
                if(maxi.front()==left){
                    maxi.pop_front();
                }
                if(mini.front()==left){
                    mini.pop_front();
                }
                left++;
            }
            maxLength=max(maxLength,right-left+1);
        }
        return maxLength;
    }
};