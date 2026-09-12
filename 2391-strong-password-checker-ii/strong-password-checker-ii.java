class Solution {
    public boolean strongPasswordCheckerII(String password) {
        int n= password.length();
        if(n<8){
            return false;
        }
        for(int i=0;i<n;i++){
            if(i<n-1 && password.charAt(i)==password.charAt(i+1)){
                return false;
            }
        }
        HashSet<Character> lower=new HashSet<>();
        HashSet<Character> upper=new HashSet<>();
        HashSet<Character> digit=new HashSet<>();
        HashSet<Character> special=new HashSet<>();
        for(char ch:password.toCharArray()){
            if(Character.isLowerCase(ch)){
                lower.add(ch);
            }
            else if(Character.isUpperCase(ch)){
                upper.add(ch);
            }
            else if(Character.isDigit(ch)){
                digit.add(ch);
            }
            else{
                special.add(ch);
            }
        }
        if(lower.size()==0||upper.size()==0||digit.size()==0||special.size()==0){
            return false;
        }
        return true;
    }

}