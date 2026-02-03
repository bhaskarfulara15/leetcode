class Solution {
    public boolean isTrionic(int[] nums) {
        int n=nums.length;
        if(n<4){
            return false;
        }
            int i=0;
            while( i+1<n && nums[i]<nums[i+1]){
                i++;
            }
            if(i==0){
                return false;
            }
            int dec=i;
            while( i+1<n&&nums[i]>nums[i+1]){
                i++;
            }
            if (i==dec){
                return false;
            }
            int inc=i;
            while(i+1<n&&nums[i]<nums[i+1]){
                i++;
            }
            if(i==inc){
                return false;
            }
            
            return i==n-1;
    }
}
