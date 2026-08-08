class Solution {
    public int[] validSequence(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        int[] dp = new int[n + 1];
        int j = m - 1;
        for (int i = n - 1; i >= 0; i--) {
            dp[i] = dp[i + 1];
            if (j >= 0 && word1.charAt(i) == word2.charAt(j)) {
                dp[i]++;
                j--;
            }
        }
        int[] ans = new int[m];
        int i = 0;
        j = 0;
        boolean changed = false;
        while (i < n && j < m) {
            if (word1.charAt(i) == word2.charAt(j)) {
                ans[j] = i;
                j++;
                i++;

            } else {
                int remaining = m - j - 1;
                if (!changed && dp[i + 1] >= remaining) {
                    ans[j] = i;
                    j++;
                    i++;
                    changed = true;

                } else {
                    i++;
                }
            }
        }
        if (j != m) {
            return new int[0];
        }
        return ans;
    }
}