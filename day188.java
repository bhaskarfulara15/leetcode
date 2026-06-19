class Solution {
    public int largestAltitude(int[] gain) {
        int alt=0;
        int maxalt=0;
        for(int g:gain){
            alt=alt+g;
            maxalt=Math.max(maxalt,alt);
        }
        return maxalt;
    }
}