class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq=new ArrayDeque<>();
        int n=nums.length;
        int[] result=new int[n-k+1];
        int i=0;
        for(int right=0;right<n;right++){
            while(!dq.isEmpty() && dq.peekFirst() <=right-k){
                dq.removeFirst();
            }
            while(!dq.isEmpty() && nums[dq.peekLast()]<nums[right]){
                dq.removeLast();
            }
            dq.addLast(right);
            if(right>=k-1){
                result[i++]=nums[dq.peekFirst()];
            }
        }
        return result;
    }
}