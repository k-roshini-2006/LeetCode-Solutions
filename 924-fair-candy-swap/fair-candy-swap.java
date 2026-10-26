class Solution {
    public int[] fairCandySwap(int[] alice, int[] bob) {
        int a=0,b=0;
        for(int i:alice){
            a+=i;
        }
        for(int i:bob){
            b+=i;
        }
        for(int i=0;i<alice.length;i++){
            for(int j=0;j<bob.length;j++){
                if((a - alice[i]+bob[j])==(b - bob[j]+alice[i])){
                    return new int[]{alice[i],bob[j]};
                }
            }
        }
        return new int[]{};
    }
}