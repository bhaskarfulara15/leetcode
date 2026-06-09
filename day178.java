class Solution {
    public long maxTotalValue(int[] nums, int k) {
        long max=Long.MIN_VALUE;
        long min=Long.MAX_VALUE;
        for(int num:nums){
            min=Math.min(num,min);
            max=Math.max(num,max);
        }
        long result=(max-min)*k;
        return result;
    }
}