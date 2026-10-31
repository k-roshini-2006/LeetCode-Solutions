class Solution {
public:
    long long minSum(vector<int>& nums1, vector<int>& nums2) {
        long sum1=0,sum2=0;
        int zero1=0,zero2=0;
        for(int i:nums1){
            if(i==0){
                zero1++;
            }
            sum1+=i;
        }
        for(int i:nums2){
            if(i==0){
                zero2++;
            }
            sum2+=i;
        }
        long min1=sum1+zero1;
        long min2=sum2+zero2;

        if((min1<min2 && zero1==0) || (min2<min1 && zero2==0)){
            return -1;
        }
        return max(min1,min2);
    }
};