class Solution {
public:
    char findTheDifference(string s, string t) {
        char r=' ';
        for(char ch:s){
            r^=ch;
        }
        for(char ch:t){
            r^=ch;
        }
        return tolower(r);
    }
};