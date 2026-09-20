class Solution {
public:
    int firstMissingPositive(vector<int>& nums) {
        int n=nums.size();
        vector<bool> freq(n+1);
        for(int i:nums){
            if(i>0 && i<=n){
                freq[i]=true;
            }
        }
        for(int i=1;i<=n;i++){
            if(!freq[i]){
                return i;
            }
        }
        return n+1;
    }
};