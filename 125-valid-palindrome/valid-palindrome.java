class Solution {
    public boolean isPalindrome(String s) {
        s=s.replaceAll("[^A-Za-z0-9]","").toLowerCase();
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        return s.equals(sb.toString());
    }
}