class Solution {
    public boolean checkRecord(String s) {
        int A=0;
        int L=0;
        for(int i=0;i<s.length();i++){

            if(s.charAt(i) =='A'){
                A++;
            }
            if((i>=1 && s.charAt(i-1)=='L') && s.charAt(i)=='L'&& (i<s.length()-1 && s.charAt(i+1)=='L')){
                L++;
            }
        }
        if(A<2 && L==0){
            return true;
        }
        return false;
    }
}