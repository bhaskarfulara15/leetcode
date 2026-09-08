class Solution {
    public int countCommas(int n) {
        int count = 0;
        for (int i = 1000; i <= n; i++) {
            if (i >= 1000 && i <= 9999) {
                count += 1;
            } else {
                count += 2;
            }
        }
        return count;
    }
}