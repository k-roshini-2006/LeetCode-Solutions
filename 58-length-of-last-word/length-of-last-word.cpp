class Solution {
public:
    int lengthOfLastWord(string s) {
      s.erase(0,s.find_first_not_of(" \t\n"));
      s.erase(s.find_last_not_of(" \t\n")+1);
      stringstream ss(s);
      vector<string> parts;
      string words;
      while(ss>>words){
        parts.push_back(words);
      }  
      return parts[parts.size()-1].length();
    }
};