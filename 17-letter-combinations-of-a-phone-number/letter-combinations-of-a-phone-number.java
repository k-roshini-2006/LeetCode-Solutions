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
        List<String> ans=new ArrayList<>();
        backtrack(digits,0,"",mp,ans);
        return ans;   
    }
    public void backtrack(String digits,int index,String curr,HashMap<Character,String> mp,List<String> ans){
        if(index==digits.length()){
            ans.add(curr);
            return;
        }
        String letter=mp.get(digits.charAt(index));
        for(int i=0;i<letter.length();i++){
            char ch=letter.charAt(i);
            backtrack(digits,index+1,curr+ch,mp,ans);
        }
    }
}