class Solution {
public:
    bool isInterleave(string s1, string s2, string s3) {
        if(s3.length() != s1.length()+s2.length()){
            return false;
        }
        map<string,bool> dp;
        return canInterleave(s1,s2,s3,0,0,dp);
    }
    bool canInterleave(string s1,string s2,string s3,int i,int j,map<string,bool>& dp){
        if(i==s1.length() && j==s2.length()){
            return true;
        }
        string s=to_string(i)+','+to_string(j);
        if(dp.find(s)!=dp.end()){
            return dp[s];
        }
        int k=i+j;
        bool result=false;
        if(i<s1.length() && s1[i]==s3[k]){
            result=canInterleave(s1,s2,s3,i+1,j,dp);
        }
        if(!result && j<s2.length() && s2[j]==s3[k]){
            result=canInterleave(s1,s2,s3,i,j+1,dp);
        }
        dp[s]=result;
        return result;
    }
};