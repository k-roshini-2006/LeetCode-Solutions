class Solution {
public:
    string digitSum(string s, int k) {
        while(s.length()>k){
            string sb="";
            int i=0;
            while(i<s.length()){
                int j=0;
                int sum=0;
                while(i<s.length() && j<k){
                    sum+=s[i]-'0';
                    i++;
                    j++;
                }
                sb+=to_string(sum);
            }
            s=sb;
        }
        return s;
    }
};