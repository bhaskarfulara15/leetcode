class Solution(object):
    def isUgly(self, n):
        if n<=0:
            return False

        prime_factors=[2,3,5]
        for factors in prime_factors:
            while n%factors==0:
                n=n//factors

        if n==1:
            return True
        else:
            return False                
        
