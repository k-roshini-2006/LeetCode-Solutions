class Solution {
public:
    int numDifferentIntegers(string word) {
        set<string> set;
        int n=word.length();
        string sb;
        for(int i=0;i<=n;i++){
            if(i<n && isdigit(word[i])){
                sb+=word[i];
            }
            else{
                if(sb.length()>0){
                    while(sb.length()>1 && sb[0]=='0'){
                        sb.erase(0,1);
                    }
                    set.insert(sb);
                    sb.clear();
                }
            }
        }
        return set.size();
    }
};