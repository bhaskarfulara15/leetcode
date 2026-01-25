class Solution(object):
    def minimumDifference(self, nums, k):
        if k==1:
            return 0
        nums.sort()
        ans = nums[k - 1] - nums[0]
        for i in range(1, len(nums) - k + 1):
            ans = min(ans, nums[i + k - 1] - nums[i])

        return ans    
        
