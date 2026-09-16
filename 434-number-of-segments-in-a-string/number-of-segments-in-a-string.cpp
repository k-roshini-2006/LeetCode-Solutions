class Solution {
public:
    int countSegments(string s) {
        s.erase(0,s.find_first_not_of(" \t\n\r"));
        s.erase(s.find_last_not_of(" \t\n\r")+1);
        if(s.empty()){
            return 0;
        }
        stringstream ss(s);
        vector<string> parts;
        string word;
        while(ss>>word){
            parts.push_back(word);
        }
        return parts.size();
    }
};