class Solution {
public:
    string reverseOnlyLetters(string s) {
        vector<char> list;
        for(char ch:s){
            if(isalpha(ch)){
                list.push_back(ch);
            }
        }
        reverse(list.begin(),list.end());
        int j=0;
        for(int i=0;i<s.length();i++){
            if(isalpha(s[i])){
                s[i]=list[j];
                j++;
            }
        }
        return s;
    }
};