import java.util.HashSet;

class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int suma=0,sumb=0;
        for(int a:aliceSizes){
            suma=suma+a;
        }
        for(int b:bobSizes){
            sumb=sumb+b;
        }
        int diff=(sumb-suma)/2;
        Set<Integer> set=new HashSet<>();
        for(int b:bobSizes){
            set.add(b);
        }
        for(int a:aliceSizes){
            int target=a+diff;
            if(set.contains(target)){
                return new int[]{a,target};
            }
        }
        return new int[]{};
    }
}