class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int lines = 1;
        int currWidth = 0;
        for(char ch : s.toCharArray()) {
            int w = widths[ch - 'a'];
            if(currWidth + w > 100) {
                lines++;
                currWidth = w;
            }
            else {
                currWidth += w;
            }
        }
        return new int[]{lines, currWidth};    
    }
}