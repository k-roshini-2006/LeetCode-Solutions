class Solution {
public:
    int vowelConsonantScore(string s) {
        s.erase(remove(s.begin(),s.end(),' '),s.end());
        int v=0;
        int c=0;
        for(char ch:s){
            if(!isdigit(ch) && isVowel(ch)){
                v++;
            }
            else if(!isdigit(ch) && !isVowel(ch)){
                c++;
            }
        }
        if(c>0){
            return floor((double)v/c);
        }
        else{
            return 0;
        }
    }
    bool isVowel(char ch){
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
    }
};