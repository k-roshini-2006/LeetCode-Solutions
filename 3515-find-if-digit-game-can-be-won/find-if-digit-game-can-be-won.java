class Solution {
    public boolean canAliceWin(int[] nums) {
        int single=0;
        int doub=0;
        for(int i:nums){
            if(digitCount(i)==1){
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
    int digitCount(int n){
        int count=0;
        while(n>0){
            n/=10;
            count++;
        }
        return count;
    }
}