class Solution {
    public boolean isSameAfterReversals(int num) {
        int rev1=reverse(num);
        int rev2=reverse(rev1);
        return num==rev2;
    }
    public int reverse(int num){
        int rev=0;
        while(num>0){
            int digit=num%10;
            rev=rev*10+digit;
            num/=10;
        }
        return rev;
    }
}