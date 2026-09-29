class Solution {
public:
    int sumDivisibleByK(vector<int>& nums, int k) {
        map<int,int> mp;
        for(int i:nums){
            mp[i]++;
        }
        int sum=0;
        for(auto entry:mp){
            if(entry.second%k==0){
                sum+=(entry.first*entry.second);
            }
        }
        return sum;
    }
};