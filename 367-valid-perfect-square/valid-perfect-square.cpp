class Solution {
public:
    bool isPerfectSquare(int num) {
        long left=0;
        long right=num;
        while(left<=right){
            long mid=(left+right)/2;
            long sqr=mid*mid;
            if(sqr==num){
                return true;
            }
            else if(sqr<num){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return false;
    }
};