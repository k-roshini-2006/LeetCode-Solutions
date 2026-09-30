class Solution {
public:
    int digitFrequencyScore(int n) {
        vector<int> digit;
        while(n>0){
            digit.push_back(n%10);
            n/=10;
        }
        map<int,int> mp;
        for(int i:digit){
            mp[i]++;
        }
        int sum=0;
        for(auto entry:mp){
            sum+=(entry.second*entry.first);
        }
        return sum;
    }
};