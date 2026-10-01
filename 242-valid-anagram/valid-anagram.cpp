class Solution {
public:
    bool isAnagram(string s, string t) {
        s.erase(remove(s.begin(),s.end(),' '),s.end());
        t.erase(remove(t.begin(),t.end(),' '),t.end());
        sort(s.begin(),s.end());
        sort(t.begin(),t.end());
        return s==t;
    }
};