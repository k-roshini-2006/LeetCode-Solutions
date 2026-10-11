class Solution {
    public List<String> letterCombinations(String digits) {
        HashMap<Character,String> mp=new HashMap<>();
        mp.put('2',"abc");
        mp.put('3',"def");
        mp.put('4',"ghi");
        mp.put('5',"jkl");
        mp.put('6',"mno");
        mp.put('7',"pqrs");
        mp.put('8',"tuv");
        mp.put('9',"wxyz");
        List<String> list=new ArrayList<>();
        backtrack(digits,0,"",list,mp);
        return list;
    }
    public void backtrack(String digits,int index,String curr,List<String> list,HashMap<Character,String> mp){
        if(index==digits.length()){
            list.add(curr);
            return;
        }
        String letter=mp.get(digits.charAt(index));
        for(int i=0;i<letter.length();i++){
            char ch=letter.charAt(i);
            backtrack(digits,index+1,curr+ch,list,mp);
        }
    }
}