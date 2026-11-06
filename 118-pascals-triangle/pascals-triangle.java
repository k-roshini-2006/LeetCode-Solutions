class Solution {
    public List<List<Integer>> generate(int num) {
        List<List<Integer>> result=new ArrayList<>();
        for(int i=0;i<num;i++){
            List<Integer> list=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==i || j==0){
                    list.add(1);
                }
                else{
                    list.add(result.get(i-1).get(j)+result.get(i-1).get(j-1));
                }
            }
            result.add(list);
        }
        return result;
    }
}