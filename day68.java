class Solution {
    public boolean canJump(int[] nums) {
        int max_=0;
        for(int i=0;i<nums.length;i++){
            if(i>max_){
                return false;
            }
            max_=Math.max(max_,i+nums[i]);
        }
        return true;
    }
}