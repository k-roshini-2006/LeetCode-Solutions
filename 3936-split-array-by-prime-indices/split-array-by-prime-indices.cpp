class Solution {
public:
    long long splitArray(vector<int>& nums) {
        vector<int> prime;
        vector<int> notPrime;
        for(int i=0;i<nums.size();i++){
            if(isPrime(i)){
                prime.push_back(nums[i]);
            }
            else{
                notPrime.push_back(nums[i]);
            }
        }
        long long sum1=0;
        for(int i:prime){
            sum1+=i;
        }
        long long sum2=0;
        for(int i:notPrime){
            sum2+=i;
        }
        long long diff=abs(sum1-sum2);
        return diff;
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