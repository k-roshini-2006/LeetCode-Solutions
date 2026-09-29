class Solution {
public:
    bool checkPrimeFrequency(vector<int>& nums) {
        map<int,int> mp;
        for(int i:nums){
            mp[i]++;
        }
        for(auto entry:mp){
            if(isPrime(entry.second)){
                return true;
            }
        }
        return false;
    }
    bool isPrime(int n){
        if(n<2){
            return false;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
};