class Solution {
    public String largestNumber(int[] nums) {
        String[] store=new String[nums.length];
        for(int i=0;i<nums.length;i++){
            store[i]=String.valueOf(nums[i]);
        }
        Arrays.sort(store,(a,b)->{
            String s1=a+b;
            String s2=b+a;
            return s2.compareTo(s1);
        });
        if(store[0].equals("0")){
            return "0";
        }
        StringBuilder sb=new StringBuilder();
        for(String s:store){
            sb.append(s);
        }
        return sb.toString();
    }
}