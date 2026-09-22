class Solution {
    public int maxDifference(String s) {
        HashMap<Character,Integer> mp=new HashMap<>();
        for(char ch:s.toCharArray()){
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }
        int maxOdd=Integer.MIN_VALUE;
        int minEven=Integer.MAX_VALUE;
        for(Map.Entry<Character,Integer> entry:mp.entrySet()){
            if(entry.getValue()%2==0){
                minEven=Math.min(minEven,entry.getValue());
            }
            else{
                maxOdd=Math.max(maxOdd,entry.getValue());
            }
        }
        return maxOdd-minEven;
    }
}