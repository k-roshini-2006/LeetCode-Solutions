class Solution {
    public int minSideJumps(int[] arr) {
        int cur=2;
        int i=1;
        int ans=0;
        while(i<arr.length-1){
            while(arr[i]!=cur){
                i++;
                if(i==arr.length-1){
                    return ans;
                }
            }
            ans++;
            if(arr[i-1]!=0){
                cur^=arr[i-1];
                continue;
            }
            while(arr[i]==0 || arr[i]==cur){
                i++;
                if(i==arr.length-1){
                    return ans;
                }
            }
            cur^=arr[i];
            i++;
        }
        return ans;
    }
}