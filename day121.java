class Solution {
    class Pair{
        int val,idx;
        Pair(int v,int i){
            val=v;
            idx=i;
        }
    }
    public List<Integer> countSmaller(int[] nums) {
        int n=nums.length;
        int[] res=new int[n];
        Pair[] arr=new Pair[n];
        for(int i=0;i<n;i++){
            arr[i]=new Pair(nums[i],i);
        }
        mergeSort(arr,0,n-1,res);
        List<Integer> ans=new ArrayList<>();
        for(int x:res) ans.add(x);
        return ans;
    }
    private void mergeSort(Pair[] arr,int l,int r,int[] res){
        if(l>=r) return;
        int mid=(l+r)/2;
        mergeSort(arr,l,mid,res);
        mergeSort(arr,mid+1,r,res);
        merge(arr,l,mid,r,res);
    }
    private void merge(Pair[] arr,int l,int mid,int r,int[] res){
        List<Pair> temp=new ArrayList<>();
        int i=l,j=mid+1,rightCount=0;
        while(i<=mid && j<=r){
            if(arr[j].val<arr[i].val){
                rightCount++;
                temp.add(arr[j++]);
            }else{
                res[arr[i].idx]+=rightCount;
                temp.add(arr[i++]);
            }
        }
        while(i<=mid){
            res[arr[i].idx]+=rightCount;
            temp.add(arr[i++]);
        }
        while(j<=r){
            temp.add(arr[j++]);
        }
        for(int k=l;k<=r;k++){
            arr[k]=temp.get(k-l);
        }
    }
}



// //Solution is Correct but--->TLE ( T(b)=O(n2))
// class Solution {
//     public List<Integer> countSmaller(int[] nums) {
//         List<Integer> count= new ArrayList<>();
//         for(int i=0;i<nums.length;i++){
//             int countn=0;
//             for(int j=i;j<nums.length;j++){
//                 if(nums[j]<nums[i]){
//                     countn++;
//                 }
//             }
//             count.add(countn);
//         }
//         return count;
//     }
// }