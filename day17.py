class Solution(object):
    def maxDepth(self, root):
        if not root:
            return 0
        left=self.maxDepth(root.left)
        right=self.maxDepth(root.right)

        maxdepth=1+max(left,right)
        return maxdepth
