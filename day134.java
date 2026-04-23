class Solution{
    public long[] distance(int[] nums){
        int n=nums.length;
        long[] res=new long[n];
        Map<Integer,List<Integer>> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.computeIfAbsent(nums[i],k->new ArrayList<>()).add(i);
        }
        for(List<Integer> list:map.values()){
            int size=list.size();
            long[] pre=new long[size];
            pre[0]=list.get(0);
            for(int i=1;i<size;i++){
                pre[i]=pre[i-1]+list.get(i);
            }
            for(int i=0;i<size;i++){
                int idx=list.get(i);
                long left=(long)idx*i-(i>0?pre[i-1]:0);
                long right=(pre[size-1]-pre[i])-(long)idx*(size-i-1);
                res[idx]=left+right;
            }
        }
        return res;
    }
}
//TLE error 
// class Solution {
//     public long[] distance(int[] nums) {
//         long[] arr=new long[nums.length];
//         for(int i=0;i<nums.length;i++){
//             long maxsum=0;
//             for(int j=0;j<nums.length;j++){
//                 if(i==j){
//                     continue;
//                 }
//                 if(nums[i]==nums[j]){
//                     int val=Math.abs(i-j);
//                     maxsum=maxsum+val;
//                 }
//             }
//             arr[i]=maxsum;
//         }
//         return arr;
//     }
// }
