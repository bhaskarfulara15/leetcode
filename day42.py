class Solution(object):
    def firstBadVersion(self, n):
        low=1
        high=n
        while low<high:
            mid=(high+low)//2
            if isBadVersion(mid):
                high=mid
            else:
                low=mid+1

        return low
