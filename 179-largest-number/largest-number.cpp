class Solution {
public:
    string largestNumber(vector<int>& nums) {
        vector<string> str(nums.size());
        for(int i=0;i<nums.size();i++){
            str[i]=to_string(nums[i]);
        }
        sort(str.begin(),str.end(),[](string a,string b){
            string s1=a+b;
            string s2=b+a;
            return s1>s2;
        });
        if(str[0]=="0"){
            return "0";
        }
        string sb;
        for(string s:str){
            sb+=s;
        }
        return sb;
    }
};