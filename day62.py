class Solution(object):
    def minRemoval(self, nums, k):
        nums.sort()
        n=len(nums)
        left=0
        max_=0
        for right in range(n):
            while nums[right]>nums[left]*k:
                left=left+1
            max_=max(max_,right-left+1)    
        return n-max_ 
