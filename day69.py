class Solution(object):
    def thirdMax(self, nums):
        unique_set=set(nums)
        unique_list=sorted(unique_set)

        if(len(unique_list)<3):
            return unique_list[-1]
        else:
            return unique_list[-3]
