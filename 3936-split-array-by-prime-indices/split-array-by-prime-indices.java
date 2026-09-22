class Solution {
    public long splitArray(int[] nums) {
        List<Integer> prime=new ArrayList<>();
        List<Integer> notPrime=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(isPrime(i)){
                prime.add(nums[i]);
            }
            else{
                notPrime.add(nums[i]);
            }
        }
        long sum1=0;
        for(int i:prime){
            sum1+=i;
        }
        long sum2=0;
        for(int i:notPrime){
            sum2+=i;
        }
        long diff=Math.abs(sum1-sum2);
        return diff;
    }
    public  boolean isPrime(int n){
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
}