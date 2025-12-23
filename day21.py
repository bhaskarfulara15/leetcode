class Solution(object):
    def preorderTraversal(self, root):
        result=[]

        def depth(root):
            if not root:
                return 

            result.append(root.val)
            depth(root.left)
            depth(root.right)

        depth(root)
        return result        
        
