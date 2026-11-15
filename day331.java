class Solution {
    public int numOfSubarrays(int[] arr) {
        int MOD = 1000000007;
        int odd = 0;
        int even = 1;
        int prefixSum = 0;
        int ans = 0;
        for (int num : arr) {
            prefixSum += num;
            if (prefixSum % 2 == 0) {
                ans = (ans + odd) % MOD;
                even++;
            } else {
                ans = (ans + even) % MOD;
                odd++;
            }
        }
        return ans;
    }
}