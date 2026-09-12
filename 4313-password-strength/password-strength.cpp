class Solution {
public:
    int passwordStrength(string password) {
        unordered_set<char> lower;
        unordered_set<char> upper;
        unordered_set<char> digit;
        unordered_set<char> special;
        for(char ch:password){
            if(islower(ch)){
                lower.insert(ch);
            }
            else if(isupper(ch)){
                upper.insert(ch);
            }
            else if(isdigit(ch)){
                digit.insert(ch);
            }
            else{
                special.insert(ch);
            }
        }
        int strength=(1*lower.size())+(2*upper.size())+(3*digit.size())+(5*special.size());
        return strength;
    }
};