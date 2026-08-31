class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode prev = head;
        ListNode curr = head.next;
        int index = 1;
        int firstCritical = -1;
        int lastCritical = -1;
        int minDistance = Integer.MAX_VALUE;
        while (curr.next != null) {
            ListNode next = curr.next;
            boolean isCritical =
                (curr.val > prev.val && curr.val > next.val) ||
                (curr.val < prev.val && curr.val < next.val);
            if (isCritical) {
                if (firstCritical == -1) {
                    firstCritical = index;
                } 
                else {
                    minDistance = Math.min(
                        minDistance,
                        index - lastCritical
                    );
                }
                lastCritical = index;
            }
            prev = curr;
            curr = next;
            index++;
        }
        if (firstCritical == -1 || firstCritical == lastCritical) {
            return new int[]{-1, -1};
        }
        int maxDistance = lastCritical - firstCritical;
        return new int[]{minDistance, maxDistance};
    }
}