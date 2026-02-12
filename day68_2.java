class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n=nums.length;
        int closestDiff=nums[0]+nums[1]+nums[2]-target;
        for(int i=0;i<n-2;i++){
            int left=i+1;
            int right=n-1;
            while(left<right){
                int currSum=nums[i]+nums[left]+nums[right];
                int currDiff=currSum-target;
                if(currDiff==0){
                    return currSum;
                }
                if(currDiff*currDiff<closestDiff*closestDiff){
                    closestDiff=currDiff;
                }
                if(currSum<target){
                    left++;
                } else{
                    right--;
                }
            }
        }
        return target+closestDiff;
    }
}
