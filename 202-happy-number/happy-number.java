class Solution {
    public boolean isHappy(int n) {
        HashMap<Integer,Boolean> mp=new HashMap<>();
        while(n!=1){
            if(mp.containsKey(n)){
                return false;
            }
            mp.put(n,true);
            int sum=0;
            while(n>0){
                int digit=n%10;
                int square=(int)Math.pow(digit,2);
                sum+=square;
                n/=10;
            }
            n=sum;
        }
        return true;
    }
}