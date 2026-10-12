class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int n=temp.length;
        Stack<Integer> st=new Stack<>();
        int curr=0;
        int[] ans=new int[n];
        for(int i=n-1;i>=0;i--){
            curr=i;
            while(!st.isEmpty() && temp[curr]>=temp[st.peek()]){
                st.pop();
            }
            if(!st.isEmpty()){
                ans[i]=st.peek()-curr;
            }
            st.push(i);
        }
        return ans;
    }
}