class Solution {
    public int numRabbits(int[] answers) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int a:answers){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        int res=0;
        for(int key:map.keySet()){
            int count=map.get(key);
            int groupSize=key+1;
            int groups=(count+groupSize-1)/groupSize;
            res=res+groups*groupSize;
        }
        return res;
    }
}
