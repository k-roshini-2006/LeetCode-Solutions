class Solution {
public:
    long long maxAlternatingSum(vector<int>& nums) {
        vector<long> arr(nums.size());
        for(int i=0;i<nums.size();i++){
            arr[i]=(long) nums[i]*nums[i];
        }
        long ans=0;
        int k=nums.size()/2;
        sort(arr.begin(),arr.end());
        for(int i=0;i<k;i++){
            ans-=arr[i];
        }
        for(int i=k;i<nums.size();i++){
            ans+=arr[i];
        }
        return ans;
    }
};