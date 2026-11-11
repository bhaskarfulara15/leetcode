class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long c1 = cost1, c2 = cost2, cb = costBoth;
        long n1 = need1, n2 = need2;
        long ans = n1 * c1 + n2 * c2;
        long minNeed = Math.min(n1, n2);
        long option2 = minNeed * cb + (n1 - minNeed) * c1 + (n2 - minNeed) * c2;
        ans = Math.min(ans, option2);
        long maxNeed = Math.max(n1, n2);
        long option3 = maxNeed * cb;
        ans = Math.min(ans, option3);
        return ans;
    }
}