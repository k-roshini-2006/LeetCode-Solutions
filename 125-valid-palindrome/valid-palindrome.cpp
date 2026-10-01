class Solution {
public:
    bool isPalindrome(string s) {
        s.erase(remove_if(s.begin(),s.end(),[](char ch){
            return !isalnum(ch);
        }),s.end());
        for(char &ch:s){
            ch=tolower(ch);
        }
        string sb=s;
        reverse(sb.begin(),sb.end());
        return sb==s;
    }
};