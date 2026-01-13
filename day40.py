class Solution(object):
    def lengthOfLongestSubstring(self, s):
        seen=set()
        left=0
        max_=0
        for right in range(len(s)):
            while(s[right] in seen):
                seen.remove(s[left])
                left=left+1
            seen.add(s[right])
            max_=max(max_,right-left+1)

        return max_        
