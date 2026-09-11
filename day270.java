class Solution {
    public int totalNumbers(int[] digits) {
        Set<Integer> set = new HashSet<>();
        for (int num = 100; num <= 999; num++) {
            if (num % 2 != 0) {
                continue;
            }
            int n = num;
            int a = n % 10;   
            n /= 10;
            int b = n % 10;     
            n /= 10;
            int c = n % 10;     
            int[] required = new int[10];
            required[a]++;
            required[b]++;
            required[c]++;
            int[] available = new int[10];
            for (int digit : digits) {
                available[digit]++;
            }
            boolean possible = true;
            for (int i = 0; i <= 9; i++) {
                if (required[i] > available[i]) {
                    possible = false;
                    break;
                }
            }
            if (possible) {
                set.add(num);
            }
        }
        return set.size();
    }
}