class Solution {
    public int minMovesToCaptureTheQueen(int a, int b, int c, int d, int e, int f) {
        if((a==e && !(c==a && Math.min(b,f)<d &&d<Math.max(b,f)))|| 
           (b==f && !(d==b && Math.min(a,e)<c && c<Math.max(a,e)))){
            return 1;
        }
        if(Math.abs(c-e)==Math.abs(d-f) &&
           !(Math.abs(a-e)==Math.abs(b-f) &&
           Math.abs(a-c)==Math.abs(b-d) &&
           Math.min(c,e)<a && a<Math.max(c,e))){
            return 1;
           }
        return 2;
    }
}