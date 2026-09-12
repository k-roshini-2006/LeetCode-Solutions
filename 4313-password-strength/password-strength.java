class Solution {
    public int passwordStrength(String password) {
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
        int strength=(1*lower.size())+(2*upper.size())+(3*digit.size())+(5*special.size());
        return strength;
    }
}