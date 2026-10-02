class Solution {
public:
    vector<string> letterCombinations(string digits) {
        vector<string> ans;
        map<char,string> mp;
        mp['2']="abc";
        mp['3']="def";
        mp['4']="ghi";
        mp['5']="jkl";
        mp['6']="mno";
        mp['7']="pqrs";
        mp['8']="tuv";
        mp['9']="wxyz";
        backtrack(digits,0,"",mp,ans);
        return ans;
    }
    void backtrack(string& digits,int index,string curr,map<char,string>& mp,vector<string>& ans){
        if(index==digits.length()){
            ans.push_back(curr);
            return;
        }
        string letter=mp[digits[index]];
        for(int i=0;i<letter.length();i++){
            char ch=letter[i];
            backtrack(digits,index+1,curr+ch,mp,ans);
        }
    }
};