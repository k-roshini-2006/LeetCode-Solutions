class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String[] parts=s.split("\\s+");
        List<String> list=new ArrayList<>(Arrays.asList(parts));
        Collections.reverse(list);
        String result=String.join(" ",list);
        return result;
    }
}