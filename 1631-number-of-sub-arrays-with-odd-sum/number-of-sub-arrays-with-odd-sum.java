class Solution {
    public int numOfSubarrays(int[] arr) {
        int sum=0,even=1,odd=0;
        int ans=0;
        int mod=(int)1e9+7;
        for(int i=0;i<arr.length;i++){
            sum=(sum+arr[i])%mod;
            if(sum%2!=0){
                ans+=even;
                odd++;
            }
            else{
                ans+=odd;
                even++;
            }
            ans%=mod;
        }
        return ans;
    }
}