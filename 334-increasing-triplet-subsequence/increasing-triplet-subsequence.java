class Solution {
    public boolean increasingTriplet(int[] nums) {
        int j=Integer.MAX_VALUE;
        int k=Integer.MAX_VALUE;
        for(int i:nums){
            if(i<=j){
                j=i;
            }
            else if(i<=k){
                k=i;
            }
            else{
                return true;
            }
        }
        return false;
    }
}