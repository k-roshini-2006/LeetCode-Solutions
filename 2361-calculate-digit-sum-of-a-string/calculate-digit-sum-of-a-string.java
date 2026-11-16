class Solution {
    public String digitSum(String s, int k) {
        while(s.length()>k){
            StringBuilder sb=new StringBuilder();
            int i=0;
            while(i<s.length()){
                int sum=0;
                int j=0;
                while(i<s.length() && j<k){
                    sum+=s.charAt(i)-'0';
                    i++;
                    j++;
                }
                sb.append(sum);
            }
            s=sb.toString();
        }
        return s;
    }
}