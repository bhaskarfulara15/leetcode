class Solution(object):
    def findMedianSortedArrays(self, nums1, nums2):
        midpoint = (len(nums1)+len(nums2))//2 + 1
        i1= 0
        i2 = 0
        median = 0
        lag_med = 0
        for i in range(midpoint):
            lag_med = median
            if i1 < len(nums1) and i2 < len(nums2):
                if nums1[i1] < nums2[i2]:
                    median = nums1[i1]
                    i1 += 1
                else:
                    median = nums2[i2]
                    i2 += 1
            elif(i2 >= len(nums2)):
                median = nums1[i1]
                i1 += 1
            else:
                median = nums2[i2]
                i2 += 1
        if not ((len(nums1)+len(nums2))%2):
            return (float(median) + float(lag_med)) / 2
        return median
