#include<unordered_set>
class Solution {
public:
    vector<int> findMissingElements(vector<int>& nums) {
        int n=nums.size();
        vector<int> arr=nums;
        sort(arr.begin(),arr.end());
        unordered_set<int> set;
        for(int i:nums){
            set.insert(i);
        }
        int mini=arr[0];
        int maxi=arr[n-1];
        vector<int> list;
        for(int i=mini;i<=maxi;i++){
            if(set.find(i)==set.end()){
                list.push_back(i);
            }
        }
        return list;
    }
};