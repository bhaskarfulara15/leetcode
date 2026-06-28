class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        if(start>destination){
            int temp=start;
            start=destination;
            destination=temp;
        }
        int total=0;
        int path=0;
        for(int i=0;i<distance.length;i++){
            total=total+distance[i];
            if(i>=start&&i<destination){
                path=path+distance[i];
            }
        }
        int result=Math.min(path,total-path);
        return result;
    }
}