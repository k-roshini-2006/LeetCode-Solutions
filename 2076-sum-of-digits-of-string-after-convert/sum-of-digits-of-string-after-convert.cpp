class Solution {
public:
    int getLucky(string s, int k) {
        string sb;
        for(int i=0;i<s.length();i++){
            sb+=to_string(s[i]-'a'+1);
        }
        for(int i=0;i<k;i++){
            int sum=0;
            for(int j=0;j<sb.length();j++){
                sum+=sb[j]-'0';
            }
            sb=to_string(sum);
        }
        return stoi(sb);
    }
};