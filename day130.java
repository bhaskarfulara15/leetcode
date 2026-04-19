class Solution{
    public int maxDistance(int[] nums1, int[] nums2){
        int i=0,j=0;
        int maxdis=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<=nums2[j]){
                maxdis=Math.max(maxdis,j-i);
                j++;
            }else{
                i++;
            }
        }
        return maxdis;
    }
}
//Brute Force (T(n) = O(n2))
// class Solution {
//     public int maxDistance(int[] nums1, int[] nums2) {
//         int maxdis=0;
//         for(int i=0;i<nums1.length;i++){
//             for(int j=i;j<nums2.length;j++){
//                 if(nums1[i]<=nums2[j]){
//                     maxdis=Math.max(maxdis,j-i);
//                 }
//             }
//         }
//         return maxdis;
//     }
// }