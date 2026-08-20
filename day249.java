import java.util.Vector;
class Solution {
    public int[] resultArray(int[] nums) {
        Vector<Integer> arr1 = new Vector<>();
        Vector<Integer> arr2 = new Vector<>();

        arr1.add(nums[0]);
        arr2.add(nums[1]);

        for (int i=2;i<nums.length;i++){
            int n=arr1.get(arr1.size() - 1);
            int m=arr2.get(arr2.size() - 1);
            if(n>m){
                arr1.add(nums[i]);
            }
            else{
                arr2.add(nums[i]);
            }
        }
        int [] result=new int[nums.length];
        int index=0; 
        for (int num : arr1) {
            result[index++] = num;
        }
        for (int num : arr2) {
            result[index++] = num;
        }
        return result;
    }
}