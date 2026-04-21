class Solution{
    public int countDigitOne(int n){
        long place=1;
        long count=0;
        while(place<=n){
            long left=n/(place*10);
            long curr =(n/place)%10;
            long right=n%place;
            if(curr==0){
                count=count+left*place;
            }else if(curr==1){
                count+=left*place+right+1;
            }else{
                count+=(left+1)*place;
            }
            place=place*10;
        }
        return (int)count;
    }
}
//TLE error
// class Solution {
//     public int countDigitOne(int n) {
//         int total=0;
//         for(int i=0;i<=n;i++){
//             total=total+countOnce(i);
//         }
//     }
//     private int countOnce(int num){
//         int count=0;
//         while(nums>0){
//             if(num%10==1){
//                 count++;
//             }
//             num=num/10;
//         }
//         return count;
//     }
// }