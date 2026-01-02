class Solution(object):
    def repeatedNTimes(self, nums):
        l=len(nums)/2
        for i in nums:
            if nums.count(i)==l:
                return i
