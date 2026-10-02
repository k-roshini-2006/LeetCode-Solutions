class Solution {
public:
    bool validDigit(int n, int digit) {
        int temp=n;
        while(temp>=10){
            temp/=10;
        }
        if(temp==digit){
            return false;
        }
        temp=n;
        map<int,int> mp;
        while(temp>0){
            mp[temp%10]++;
            temp/=10;
        }
        for(int i=0;i<mp.size();i++){
            if(mp.find(digit)!=mp.end()){
                if(mp[digit]>=1){
                    return true;
                }
            }
        }
        return false;

    }
};