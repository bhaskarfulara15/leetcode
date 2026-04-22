import java.util.*;

class Solution {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer, Integer> count = new HashMap<>();
        HashMap<Integer, Integer> first = new HashMap<>();
        HashMap<Integer, Integer> last = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];

            if (!first.containsKey(num)) {
                first.put(num, i);
            }

            last.put(num, i);
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        int degree = 0;
        for (int f : count.values()) {
            degree = Math.max(degree, f);
        }

        int minLen = Integer.MAX_VALUE;
        for (int num : count.keySet()) {
            if (count.get(num) == degree) {
                int len = last.get(num) - first.get(num) + 1;
                minLen = Math.min(minLen, len);
            }
        }

        return minLen;
    }
}
