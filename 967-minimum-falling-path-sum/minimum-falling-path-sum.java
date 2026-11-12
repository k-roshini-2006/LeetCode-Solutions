class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n=matrix.length;
        int[][] dp=new int[n][n];
        for(int i=0;i<n;i++){
            dp[0][i]=matrix[0][i];
        }
        for(int i=1;i<n;i++){
            for(int j=0;j<n;j++){
                int top=dp[i-1][j];
                int left=Integer.MAX_VALUE;
                int right=Integer.MAX_VALUE;
                if(j>0){
                    left=Math.min(left,dp[i-1][j-1]);
                }
                if(j<n-1){
                    right=Math.min(left,dp[i-1][j+1]);
                }
                dp[i][j]=matrix[i][j]+Math.min(top,Math.min(left,right));
            }
        }
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            ans=Math.min(ans,dp[n-1][i]);
        }
        return ans;
    }
}