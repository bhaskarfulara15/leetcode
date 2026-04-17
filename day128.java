class Solution{
    public int minSubArrayLen(int target, int[] nums) {
        int left=0;
        int sum=0;
        int minl=Integer.MAX_VALUE;
        for(int right=0;right<nums.length;right++){
            sum=sum+nums[right];
            while(sum>=target){
                minl=Math.min(minl, right-left+1);
                sum=sum-nums[left];
                left++;
            }
        }
        if(minl==Integer.MAX_VALUE){
            return 0;
        }
        else{
            return minl;
        }
    }
}
// Brute Force (T(n)= O(n2))
// class Solution {
//     public int minSubArrayLen(int target, int[] nums) {
//         int n=nums.length;
//         int minl=Integer.MAX_VALUE;
//         for(int i=0;i<n;i++){
//             int sum=0;
//             for(int j=i;j<n;j++){
//                 sum=sum+num[j];
//                 if(sum>=target){
//                     manl=Math.min(minl,j-i+1);
//                     break;
//                 }
//             }
//         }
//         if(minl==Integer.MAX_VALUE){
//             return 0;
//         }
//         else{
//             return minl;
//         }
//     }
// }