class Solution {
public:
    bool isSameAfterReversals(int num) {
        int rev1=reverseOfNum(num);
        int rev2=reverseOfNum(rev1);
        return num==rev2;
    }
    int reverseOfNum(int num){
        int rev=0;
        while(num>0){
            int digit=num%10;
            rev=rev*10+digit;
            num/=10;
        }
        return rev;
    }
};