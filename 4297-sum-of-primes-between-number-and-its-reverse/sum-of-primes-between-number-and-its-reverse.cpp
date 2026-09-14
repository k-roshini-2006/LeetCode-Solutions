class Solution {
public:
    int sumOfPrimesInRange(int n) {
        int max=reverseOfN(n);
        if(max>n){
            int sum=0;
            for(int i=n;i<=max;i++){
                if(isPrime(i)){
                    sum+=i;
                }
            }
            return sum;
        }
        else{
            int sum=0;
            for(int i=max;i<=n;i++){
                if(isPrime(i)){
                    sum+=i;
                }
            }
            return sum;
        }
    }
    int reverseOfN(int n){
        int rev=0;
        while(n>0){
            int digit=n%10;
            rev=rev*10+digit;
            n/=10;
        }
        return rev;
    }
    bool isPrime(int n){
        if(n<2){
            return false;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
};