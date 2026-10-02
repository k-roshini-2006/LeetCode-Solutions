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
                sum+=Math.pow(digit,2);
                n/=10;
            }
            n=sum;
        }
        return true;
    }
}