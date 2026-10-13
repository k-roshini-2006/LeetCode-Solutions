class Solution {
public:
    int maxProduct(int num) {
        vector<int> digit;
        while(num>0){
            digit.push_back(num % 10);
            num/=10;
        }
        sort(digit.begin(),digit.end());
        int n=digit.size();
        return digit[n-1]*digit[n-2];
    }
};