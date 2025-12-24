class Solution(object):
    def postorderTraversal(self, root):
        result = []

        def depth(node):
            if not node:
                return
            depth(node.left)
            depth(node.right)
            result.append(node.val)

        depth(root)
        return result
