class Solution(object):
    def missingNumber(self, nums):
        n=len(nums)
        total=n*(n+1)//2
        array_total=sum(nums)
        return total-array_total   
