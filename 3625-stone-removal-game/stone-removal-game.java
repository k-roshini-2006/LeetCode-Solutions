class Solution {
    public boolean canAliceWin(int n) {
        int i=10;
        while(n>=0){
            n=n-i;
            i--;
        }
        return i%2==0;
    }
}