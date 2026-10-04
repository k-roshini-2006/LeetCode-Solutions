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
        backtrack(0,digits,"",mp,list);
        return list;
    }
    public void backtrack(int index,String digits,String curr,HashMap<Character,String> mp,List<String> list){
        if(index==digits.length()){
            list.add(curr);
            return;
        }
        String letters=mp.get(digits.charAt(index));
        for(int i=0;i<letters.length();i++){
            char ch=letters.charAt(i);
            backtrack(index+1,digits,curr+ch,mp,list);
        }
    }
}