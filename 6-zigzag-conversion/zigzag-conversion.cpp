class Solution {
public:
    string convert(string s, int numRows) {   
        if(numRows==1 || numRows==s.length()){
            return s;
        }
        vector<string> list;
        for(int i=0;i<numRows;i++){
            list.push_back("");
        }
        int row=0;
        bool down=false;
        for(int i=0;i<s.length();i++){
            list[row]=list[row]+s[i];
            if(row==numRows-1){
                down=false;
            }
            if(row==0){
                down=true;
            }
            if(down){
                row++;
            }
            else{
                row--;
            }
        }
        string sb;
        for(string i:list){
            sb+=i;
        }
        return  sb;
    }
};