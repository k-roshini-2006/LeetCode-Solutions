class Solution {
    public int findMinFibonacciNumbers(int k) {
        List<Integer> list=new ArrayList<>();
        int a=1;
        int b=1;
        list.add(a);
        list.add(b);
        while(a+b<=k){
            int c=a+b;
            list.add(c);
            a=b;
            b=c;
        }
        int count=0;
        for(int i=list.size()-1;i>=0;i--){
            if(list.get(i)<=k){
                k-=list.get(i);
                count++;
                if(k==0){
                    break;
                }
            }
        }
        return count;
    }
}