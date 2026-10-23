class Solution {
    public boolean isMonotonic(int[] nums) {
        int[] nums1=new int[nums.length];
        System.arraycopy(nums,0,nums1,0,nums.length);
        Arrays.sort(nums1);
        List<Integer> list=new ArrayList<>();
        for(int i:nums){
            list.add(i);
        }
        Collections.sort(list);
        Collections.reverse(list);
        int[] nums2=new int[nums1.length];
        for(int i=0;i<nums.length;i++){
            nums2[i]=list.get(i);
        }
        return Arrays.equals(nums1,nums)||Arrays.equals(nums2,nums);
       
    }
}