class Solution {
public:
    int mostFrequentEven(vector<int>& nums) {
        map<int,int> mp;
        sort(nums.begin(),nums.end());
        for(int i:nums){
            if(i%2==0){
                mp[i]++;
            }
        }
        int ans=-1;
        int maxi=0;
        for(int i:nums){
            if(i%2==0){
                if(mp[i]>maxi){
                    maxi=mp[i];
                    ans=i;
                }
            }
        }
        return ans;
    }
};