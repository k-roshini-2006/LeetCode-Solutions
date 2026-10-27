class Solution {
    public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
        HashSet<String> set=new HashSet<>();
        for(int[] q:queens){
            set.add(q[0] + "," + q[1]);
        }
        int[][] direction={
            {-1,-1},{-1,1},{1,-1},{1,1},
            {0,1}  ,{0,-1},{1,0} ,{-1,0}
        };
        List<List<Integer>> list=new ArrayList<>();
        for(int[] dir:direction){
            int row=dir[0]+king[0];
            int col=dir[1]+king[1];
            while(row>=0 && row<8 && col>=0 && col<8){
                String pos=row + "," + col;
                if(set.contains(pos)){
                    list.add(new ArrayList<>(Arrays.asList(row,col)));
                    break;
                }
                row+=dir[0];
                col+=dir[1];
            }
        }
        return list;
    }
}