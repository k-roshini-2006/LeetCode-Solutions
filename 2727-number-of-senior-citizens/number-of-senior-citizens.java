class Solution {
    public int countSeniors(String[] details) {
        int n=details.length;
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            ans[i] = Integer.parseInt(details[i].substring(11,13));
        }
        int count=0;
        for(int i:ans){
            if(i>60){
                count++;
            }
        }
        return count;
    }
}