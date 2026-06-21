class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int result=0;
        int currcoin=coins;
        Arrays.sort(costs);
        for(int i=0;i<costs.length;i++){
            if(costs[i]<=currcoin){
                result++;
                currcoin=currcoin-costs[i];
            }
            else{
                break;
            }
        }
        return result;
    }
}