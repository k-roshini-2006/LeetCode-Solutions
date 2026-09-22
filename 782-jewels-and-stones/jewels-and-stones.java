class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character,Integer> mp=new HashMap<>();
        for(char ch:stones.toCharArray()){
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }
        int sum=0;
        for(int i=0;i<jewels.length();i++){
            if(mp.containsKey(jewels.charAt(i))){
                sum+=mp.get(jewels.charAt(i));
            }
        }
        return sum;
    }
}