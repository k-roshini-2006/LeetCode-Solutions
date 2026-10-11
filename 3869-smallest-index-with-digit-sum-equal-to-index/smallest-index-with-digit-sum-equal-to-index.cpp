class Solution {
public:
    int smallestIndex(vector<int>& nums) {
        for(int i=0;i<nums.size();i++){
            int temp=nums[i];
            int total=0;
            while(temp>0){
                total+=(temp%10);
                temp/=10;
            }
            if(total==i){
                return i;
            }
        }
        return -1;
    }
};