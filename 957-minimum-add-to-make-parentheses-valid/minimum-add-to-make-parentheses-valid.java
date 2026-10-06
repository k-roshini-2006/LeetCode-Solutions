class Solution {
    public int minAddToMakeValid(String s) {
        while(true){
            int i=s.indexOf("()");
            if(i==-1){
                return s.length();
            }
            s=s.substring(0,i)+s.substring(i+2);
        }
    }
}