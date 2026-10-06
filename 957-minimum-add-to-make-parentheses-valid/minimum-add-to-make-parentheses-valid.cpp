class Solution {
public:
    int minAddToMakeValid(string s) {
        while(true){
            int i=s.find("()");
            if(i==-1){
                return s.length();
            }
            s=s.substr(0,i)+s.substr(i+2);
        }
    }
};