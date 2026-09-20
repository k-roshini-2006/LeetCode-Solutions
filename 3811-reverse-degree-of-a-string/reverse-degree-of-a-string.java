class Solution {
    public int reverseDegree(String s) {
        int[] index=new int[s.length()];
        for(int i=0;i<s.length();i++){
            index[i]=26-(s.charAt(i)-'a');
        }
        int sum=0;
        for(int i=0;i<s.length();i++){
            sum+=index[i]*(i+1);
        }
        return sum;
    }
}