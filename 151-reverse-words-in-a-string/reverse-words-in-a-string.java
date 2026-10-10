class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String[] str=s.split("\\s+");
        List<String> list=new ArrayList<>(Arrays.asList(str));
        Collections.reverse(list);
        String ans=String.join(" ",list);
        return ans;
    }
}