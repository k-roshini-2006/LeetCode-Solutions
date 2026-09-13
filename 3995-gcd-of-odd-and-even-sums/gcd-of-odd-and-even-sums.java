class Solution {
    public int gcdOfOddEvenSums(int n) {
        int evenSum = 0;
        int oddSum=0;
        for(int i=1;i<=n;i++){
            evenSum+=(2*i);
            oddSum+=(2*i-1);
        }
        return gcd(evenSum,oddSum);
    }
    public int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}