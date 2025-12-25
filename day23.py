class Solution(object):
    def getIntersectionNode(self, headA, headB):
        if headA is None:
            return None
        if headB is None:
            return None
        
        pA = headA
        pB = headB
        
        while pA is not pB:
            
            if pA is None:
                pA = headB
            else:
                pA = pA.next
            
            if pB is None:
                pB = headA
            else:
                pB = pB.next
        
        return pA
        
