class Solution {
public:
    bool isPalindrome(string s) {
        s.erase(remove_if(s.begin(),s.end(),[](char ch){
            return !isalnum(ch);
        }),s.end());
        for(char& ch:s){
            ch=tolower(ch);
        }
        string temp=s;
        reverse(s.begin(),s.end());
        return s==temp;
    }
};