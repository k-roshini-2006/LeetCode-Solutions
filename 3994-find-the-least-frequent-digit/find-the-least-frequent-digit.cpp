class Solution {
public:
    int getLeastFrequentDigit(int n) {
        vector<int> digit;
        while(n>0){
            digit.push_back(n%10);
            n/=10;
        }
        map<int,int> mp;
        for(int i:digit){
            mp[i]++;
        }
        int min=INT_MAX;
        int mindigit=0;
        for(auto entry:mp){
            if(entry.second<min){
                min=entry.second;
                mindigit=entry.first;
            }
        }
        return mindigit;
    }
};