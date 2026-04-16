class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalgas=0;
        int totalcost=0;
        int tank=0;
        int start=0;
        for(int i=0;i<gas.length;i++){
            totalgas=totalgas+gas[i];
            totalcost=totalcost+cost[i];
            tank=tank+gas[i]-cost[i];
            if(tank<0){
                start=i+1;
                tank=0;
            }
        }
        if(totalgas>=totalcost){
            return start;
        }
        else{
            return -1;
        }
    }
}