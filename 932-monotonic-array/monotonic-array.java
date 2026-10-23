class Solution {
    public boolean isMonotonic(int[] nums) {
       int[] asc=nums.clone();
       Arrays.sort(asc);
       int[] desc=Arrays.stream(nums).boxed().sorted(Collections.reverseOrder()).mapToInt(i -> i).toArray();
       return Arrays.equals(asc,nums) || Arrays.equals(desc,nums); 
    }
}