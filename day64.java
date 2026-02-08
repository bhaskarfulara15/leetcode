class Solution {
    public boolean isBalanced(TreeNode root) {
        return height(root)!=-1;
    }
    private int height(TreeNode node){
        if(node==null){
            return 0;
        }
        int left=height(node.left);
        if(left==-1){
            return -1;
        }
        int right=height(node.right);
        if(right==-1){
            return -1;
        }
        if(left-right>1||right-left>1){
            return -1;
        }
        if(left>right){
            return left+1;
        }else{
            return right+1;
        }
    }
}