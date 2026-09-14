class Solution {
    public int isWinner(int[] player1, int[] player2) {
        int n1=player1.length;
        int n2=player2.length;
        int sum1=0;
        int sum2=0;
        for(int i=0;i<n1;i++){
            if((i>=1 && player1[i-1]==10) ||(i>=2 && player1[i-2]==10)){
                sum1+=2*player1[i];
            }
            else{
                sum1+=player1[i];
            }
        }
        for(int i=0;i<n2;i++){
            if((i>=1 && player2[i-1]==10) ||(i>=2 && player2[i-2]==10)){
                sum2+=2*player2[i];
            }
            else{
                sum2+=player2[i];
            }
        }
        if(sum1>sum2){
            return 1;
        }
        else if(sum1<sum2){
            return 2;
        }
        else{
            return 0;
        }
    }
}