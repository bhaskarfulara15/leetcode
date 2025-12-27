class Solution:
        def hasPathSum(self, root, targetSum):
            if root is None:
                return False
        
            remainingSum = targetSum - root.val
        
            if root.left is None and root.right is None:
                if remainingSum == 0:
                    return True
                else:
                    return False
        
            leftResult = False
            if root.left is not None:
                leftResult = self.hasPathSum(root.left, remainingSum)

            rightResult = False
            if root.right is not None:
                rightResult = self.hasPathSum(root.right, remainingSum)
        
            if leftResult or rightResult:
                return True
            else:
                return False
