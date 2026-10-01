class Solution {
public:
    string reverseWords(string s) {
        s.erase(0,s.find_first_not_of(" \t\n"));
        s.erase(s.find_last_not_of(" \t\n")+1);
        stringstream ss(s);
        string word;
        vector<string> parts;
        while(ss>>word){
            parts.push_back(word);
        }
        reverse(parts.begin(),parts.end());
        string sb;
        for(int i=0;i<parts.size();i++){
            sb+=parts[i];
            if(i<parts.size()-1){
                sb+=" ";
            }
        }
        return sb;
    }
};