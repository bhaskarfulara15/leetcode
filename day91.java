class Solution {
    public int jump(int[] nums) {
        int jump=0;
        int longest=0;
        int last=0;
        for(int i=0;i<nums.length-1;i++){
            longest=Math.max(longest,i+nums[i]);
            if(last==i){
                jump++;
                last=longest;
            }
        }
        return jump;
    }
}
