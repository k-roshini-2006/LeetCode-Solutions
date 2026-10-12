class Solution {
    public int elevatorRequests(int n, int[] request) {
        int total=Math.abs(0-request[0]);
        for(int i=1;i<request.length;i++){
            total+=Math.abs(request[i]-request[i-1]);
        }
        return total;
    }
}