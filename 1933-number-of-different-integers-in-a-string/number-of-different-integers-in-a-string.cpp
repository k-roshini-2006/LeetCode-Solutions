class Solution {
public:
    int numDifferentIntegers(string word) {
        unordered_set<string> set;
        string sb;
        int n=word.length();
        for(int i=0;i<=n;i++){
            if(isdigit(word[i])){
                sb+=word[i];
            }else{
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