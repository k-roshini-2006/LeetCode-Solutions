class Solution {
public:
    string removeOuterParentheses(string s) {
        string sb;
        int count=0;
        for(char ch:s){
            if(ch=='('){
                if(count>0){
                    sb+=ch;
                }
                count++;
            }
            else{
                count--;
                if(count>0){
                    sb+=ch;
                }
            }
        }
        return sb;
    }
};