class Solution(object):
    def minPairSum(self, nums):
        result=0
        nums.sort()
        i=0
        j=len(nums)-1

        while i<j:
            result=max(result,nums[i]+nums[j])
            j=j-1
            i=i+1

        return result   
