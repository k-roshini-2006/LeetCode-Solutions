class Solution {
public:
    int firstUniqueEven(vector<int>& nums) {
        unordered_map<int,int> mp;
        for(int i=0;i<nums.size();i++){
            mp[nums[i]]++;
        }
        int element=-1;
        for(int i=0;i<nums.size();i++){
            if(nums[i]%2==0 && mp[nums[i]]==1){
                element=nums[i];
                break;
            }
        }
        return element;
    }
};