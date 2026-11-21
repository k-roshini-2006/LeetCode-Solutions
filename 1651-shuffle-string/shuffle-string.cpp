class Solution {
public:
    string restoreString(string s, vector<int>& indices) {
        string ch=s;
        for(int i=0;i<indices.size();i++){
            ch[indices[i]]=s[i];
        }
        return ch;
    }
};