class Solution {
public:
    bool isPalindrome(string s) {
        s.erase(remove_if(s.begin(),s.end(),[](char ch){
            return !isalnum(ch);
        }),s.end());
        for(char &ch:s){
            ch=tolower(ch);
        }
        int left=0;
        int right=s.length()-1;
        while(left<right){
            if(s[left]!=s[right]){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
};