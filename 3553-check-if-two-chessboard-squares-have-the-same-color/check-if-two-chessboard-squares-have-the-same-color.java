class Solution {
    public boolean checkTwoChessboards(String c1, String c2) {
        int s1=c1.charAt(0)+c1.charAt(1);
        int s2=c2.charAt(0)+c2.charAt(1);
        return s1 % 2 == s2 % 2 ;
    }
}