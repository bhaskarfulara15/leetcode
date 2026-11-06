class Solution {
    public int[] countServers(int n, int[][] logs, int x, int[] queries) {
        Arrays.sort(logs, (a, b) -> Integer.compare(a[1], b[1]));
        int[][] q = new int[queries.length][2];
        for (int i = 0; i < queries.length; i++) {
            q[i][0] = queries[i];
            q[i][1] = i;
        }
        Arrays.sort(q, (a, b) -> Integer.compare(a[0], b[0]));
        int[] ans = new int[queries.length];
        int[] freq = new int[n + 1];
        int left = 0;
        int right = 0;
        int activeServers = 0;
        for (int[] query : q) {
            int time = query[0];
            int index = query[1];
            int startTime = time - x;
            while (right < logs.length && logs[right][1] <= time) {
                int serverId = logs[right][0];
                if (freq[serverId] == 0) {
                    activeServers++;
                }
                freq[serverId]++;
                right++;
            }
            while (left < right && logs[left][1] < startTime) {
                int serverId = logs[left][0];
                freq[serverId]--;
                if (freq[serverId] == 0) {
                    activeServers--;
                }
                left++;
            }
            ans[index] = n - activeServers;
        }
        return ans;
    }
}
