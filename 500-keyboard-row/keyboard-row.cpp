class Solution {
public:
    vector<string> findWords(vector<string>& words) {
        unordered_set<char> row1;
        unordered_set<char> row2;
        unordered_set<char> row3;
        string s1="qwertyuiop";
        string s2="asdfghjkl";
        string s3="zxcvbnm";
        for(char ch:s1){
            row1.insert(ch);
        }
        for(char ch:s2){
            row2.insert(ch);
        }
        for(char ch:s3){
            row3.insert(ch);
        }
        vector<string> list;
        for(int i=0;i<words.size();i++){
            unordered_set<char> row;
            string s=words[i];
            for(char& ch: s){
                ch=tolower(ch);
            }
            for(int i=0;i<s.length();i++){
                if(row1.find(s[i])!=row1.end()){
                    row=row1;
                }
                else if(row2.find(s[i])!=row2.end()){
                    row=row2;
                }
                else{
                    row=row3;
                }
            }
            bool valid =true;
            for(int i=0;i<s.length();i++){
                if(row.find(s[i])==row.end()){
                    valid =false;
                    break;
                }
            }
            if(valid){
                list.push_back(words[i]);
            }
        }
        return list;

    }
};