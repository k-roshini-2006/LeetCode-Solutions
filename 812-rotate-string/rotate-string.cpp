class Solution {
public:
    bool rotateString(string s, string goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        string temp=s+s;
        if(temp.find(goal)!=string::npos){
            return true;
        }
        return false;
    }
    //left rotation and right rotation just for reference
    string left(string s,int k){
        int n=s.length();
        k=k%n;
        string ans=s.substr(k)+s.substr(0,k);
        return ans;
    }
    string right(string s,int k){
        int n=s.length();
        k=k%n;
        string ans=s.substr(n-k)+s.substr(0,n-k);
        return ans;
    }
};