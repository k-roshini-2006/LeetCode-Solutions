class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int median=nums[n/2]
;        int moves=0;
        for(int i:nums){
            moves+=Math.abs(i -median);
        }
        return moves;
    }
}