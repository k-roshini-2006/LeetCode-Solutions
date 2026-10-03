class Solution {
public:
    vector<int> searchRange(vector<int>& nums, int target) {
        int first=-1,last=-1,left=0,right=nums.size()-1;
        while(left<=right){
            int mid=(right+left)/2;
            if(nums[mid]==target){
                first=mid;
                right=mid-1;
            }
            else if(nums[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        left=0;
        right=nums.size()-1;
        while(left<=right){
            int mid=(right+left)/2;
            if(nums[mid]==target){
                last=mid;
                left=mid+1;
            }
            else if(nums[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return vector<int>{first,last};
    }
};