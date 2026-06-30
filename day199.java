import java.util.HashMap;

class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int card:deck){
            map.put(card,map.getOrDefault(card,0)+1);
        }
        int gcd=0;
        for(int count:map.values()){
            gcd=findgcd(gcd,count);
        }
        return gcd>1;
    }
    public int findgcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}