class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(a,b)->Integer.compare(a[0],b[0]));
        int start=points[0][0];
        int end=points[0][1];
        int arrow=1;
        for(int i=0;i<points.length;i++){
            int currStart=points[i][0];
            int currEnd=points[i][1];
            if(currStart<=end){
                end=Math.min(end,currEnd);
            }
            else{
                arrow++;
                start=currStart;
                end=currEnd;
            }
        }
        return arrow;
    }
}