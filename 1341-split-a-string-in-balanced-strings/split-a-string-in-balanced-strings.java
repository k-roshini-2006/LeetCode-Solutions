class Solution {
    public int balancedStringSplit(String s) {
        int count=0;
        int balanced=0;
        Stack<Character> L=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='R'){
                count++;
            }
            else{
                count--;
            }
            if(count==0){
                balanced++;
            }
        }
        return balanced;
    }
}