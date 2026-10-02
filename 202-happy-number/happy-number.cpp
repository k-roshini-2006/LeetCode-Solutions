class Solution {
public:
    bool isHappy(int n) {
        map<int,bool> mp;
        while(n!=1){
            if(mp.find(n)!=mp.end()){
                return false;
            }
            mp[n]=true;
            int sum=0;
            while(n>0){
                int digit=n%10;
                sum+=pow(digit,2);
                n/=10;
            }
            n=sum;
        }
        return true;
    }
};