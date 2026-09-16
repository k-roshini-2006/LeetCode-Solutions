class Solution {
public:
    vector<int> vowelStrings(vector<string>& word, vector<vector<int>>& queries) {
        int n=word.size();
        vector<int> prefix(n,0);
        for(int i=0;i<n;i++){
            if(isVowel(word[i][0]) && isVowel(word[i].back())){
                prefix[i]=1;
            }
            if(i>0){
                prefix[i]+=prefix[i-1];
            }
        }
        vector<int> ans;
        for(auto q:queries){
            int left=q[0];
            int right=q[1];
            if(left==0){
                ans.push_back(prefix[right]);
            }
            else{
                ans.push_back(prefix[right]-prefix[left-1]);
            }
        }
        return ans;
    }
    bool isVowel(char ch){
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U';
    }
};