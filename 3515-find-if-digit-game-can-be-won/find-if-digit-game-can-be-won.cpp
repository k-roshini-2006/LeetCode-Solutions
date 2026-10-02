class Solution {
public:
    bool canAliceWin(vector<int>& nums) {
        int single=0;
        int doub=0;
        for(int i:nums){
            if(i<10){
                single+=i;
            }
            else{
                doub+=i;
            }
        }
        if(single==doub){
            return false;
        }
        else{
            return true;
        }
    }
};