class Solution(object):
    def moveZeroes(self, nums):
        temp=0
        for i in range(len(nums)):
            if nums[i]!=0:
                nums[temp]=nums[i]
                temp=temp+1

        for i in range(temp,len(nums)):
            nums[i]=0

        return nums            
