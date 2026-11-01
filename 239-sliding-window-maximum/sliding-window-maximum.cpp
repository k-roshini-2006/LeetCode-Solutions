class Solution {
public:
    vector<int> maxSlidingWindow(vector<int>& nums, int k) {
        deque<int> dq;
        int n=nums.size();
        vector<int> result(n-k+1);
        int i=0;
        for(int right=0;right<n;right++){
            while(!dq.empty() && dq.front()<=right-k){
                dq.pop_front();
            }
            while(!dq.empty() && nums[dq.back()]<nums[right]){
                dq.pop_back();
            }
            dq.push_back(right);
            if(right>=k-1){
                result[i++]=nums[dq.front()];
            }
        }
        return result;
    }
};