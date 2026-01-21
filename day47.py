class Solution(object):
    def sumOfLeftLeaves(self, root):
        if not root:
            return 0
        total=0
        if root.left:
            if not root.left.left and not root.left.right:
                total=total+root.left.val
        total=total+self.sumOfLeftLeaves(root.left)     
        total=total+self.sumOfLeftLeaves(root.right)      

        return total
