class Solution {
    int max_=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        solve(root);
        return max_;
    }
    public int solve(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=Math.max(0,solve(root.left));
        int right=Math.max(0,solve(root.right));
        int currsum=left+right+root.val;
        max_=Math.max(currsum,max_);
        
        return root.val+Math.max(left,right); 
    }
}
