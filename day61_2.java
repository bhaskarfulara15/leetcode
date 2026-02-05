class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n=nums.length;
        int[] result=new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                result[i]=0;
            }
            else{
                int newindex=(i+nums[i])%n;
                if(newindex<0){
                    newindex=newindex+n;
                }
                result[i]=nums[newindex];
            }
        }
        return result;
    }
}
