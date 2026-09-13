class Solution {
public:
    string firstPalindrome(vector<string>& words) {
        string ans="";
        for(int i=0;i<words.size();i++){
            if(isPalindrome(words[i])){
                ans=words[i];
                break;
            }
        }
        return ans;
    }
    bool isPalindrome(string s){
        string temp=s;
        reverse(temp.begin(),temp.end());
        return s==temp;
    }
};