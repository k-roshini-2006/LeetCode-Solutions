class Solution {
public:
    int minMoves(vector<int>& nums) {
        int mini=INT_MAX;
        for(int i:nums){
            mini=min(mini,i);
        }
        int moves=0;
        for(int i:nums){
            moves+=i-mini;
        }
        return moves;
    }
};