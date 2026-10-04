class Solution {
    public int countNegatives(int[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        int count=0;
        for(int i=0;i<row;i++){
            int left=0;
            int right=col-1;
            while(left<=right){
                int mid=(left+right)/2;
                if(grid[i][mid]<0){
                    right=mid-1;//arrays are in descending order
                }
                else{
                    left=mid+1;
                }
            }
            count+=col-left;
        }
        return count;
    }
}