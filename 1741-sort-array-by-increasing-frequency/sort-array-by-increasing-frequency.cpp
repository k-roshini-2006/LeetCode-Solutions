class Solution {
public:
    vector<int> frequencySort(vector<int>& nums) {
        int n=nums.size();
        map<int,int> mp;
        for(int i=0;i<n;i++){
           mp[nums[i]]++;
        }
        vector<int> arr=nums;
        sort(arr.begin(),arr.end(),[&](int a,int b){
            if(mp[a]!=mp[b]){
                return mp[a]<mp[b];
            }
            return a>b;
        });
        for(int i=0;i<n;i++){
            nums[i]=arr[i];
        }
        return nums;
    }
};