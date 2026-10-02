class Solution {
    public int reverseBits(int n) {
        int reverse=0;
        for(int i=0;i<32;i++){
            int bits=n&1;
            reverse=(reverse<<1)|bits;
            n>>>=1;
        }
        return reverse;
    }
}