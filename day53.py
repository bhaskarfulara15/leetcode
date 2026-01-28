class Solution(object):
    def findMaxConsecutiveOnes(self, nums):
        result=0
        count=0
        for num in nums:
            if num==1:
                count=count+1
                result=max(result,count)
            else:
                count=0

        return result            
