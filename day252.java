class Solution {
    public boolean sumGame(String num) {
        int n = num.length();
        int half = n / 2;
        int leftSum = 0;
        int rightSum = 0;
        int leftQ = 0;
        int rightQ = 0;
        for (int i = 0; i < n; i++) {
            char ch = num.charAt(i);

            if (i < half) {
                if (ch == '?') {
                    leftQ++;
                } else {
                    leftSum += ch - '0';
                }
            } else {
                if (ch == '?') {
                    rightQ++;
                } else {
                    rightSum += ch - '0';
                }
            }
        }
        if ((leftQ + rightQ) % 2 != 0) {
            return true;
        }
        return (leftSum - rightSum) * 2 != (rightQ - leftQ) * 9;
    }
}