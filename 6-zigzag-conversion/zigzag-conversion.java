class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1||numRows>=s.length()){
            return s;
        }
        List<String> list=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            list.add("");
        }
        int row=0;
        boolean down=false;
        for(int i=0;i<s.length();i++){
            list.set(row,list.get(row)+s.charAt(i));
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
        StringBuilder sb=new StringBuilder();
        for(String i:list){
            sb.append(i);
        }
        return sb.toString();
    }
}