class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int [] answer=new int[n];
        int total=0;
        for(int num : nums){
            total=total+num;
        }
        int leftsum=0;
        for(int i=0;i<n;i++){
            int rightsum=total-leftsum-nums[i];
            answer[i]=Math.abs(leftsum-rightsum);
            leftsum=leftsum+nums[i];
        } 
        return answer;
    }
}