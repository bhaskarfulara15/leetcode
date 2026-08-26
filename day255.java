class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int n = s.length();
        String answer = "";
        for (int left = 0; left < n; left++) {
            int ones = 0;
            for (int right = left; right < n; right++) {
                if (s.charAt(right) == '1') {
                    ones++;
                }
                if (ones == k) {
                    String current = s.substring(left, right + 1);
                    if (answer.equals("") ||
                        current.length() < answer.length() ||
                        (current.length() == answer.length() &&
                         current.compareTo(answer) < 0)) {
                        answer = current;
                    }
                    break;
                }
            }
        }
        return answer;
    }
}