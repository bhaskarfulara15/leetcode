class Solution {
    public int lastStoneWeight(int[] stones) {
        int n=stones.length;
        while(n>1){
            Arrays.sort(stones,0,n);
            int y=stones[n-1];
            int x=stones[n-2];
            if(x==y){
                n=n-2;
            }
            else{
                stones[n-2]=y-x;
                n=n-1;
            }
        }
        if(n==1){
            return stones[0];
        }
        else{
            return 0;
        }
    }
}
