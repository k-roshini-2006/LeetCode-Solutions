class Solution {
public:
    string clearDigits(string s) {
        string sb;
        for(char ch:s){
            if(isdigit(ch)){
                if(sb.length()>0){
                    sb.erase(sb.length()-1);
                }
            }
            else{
                sb+=ch;
            }
        }
        return sb;
    }
};