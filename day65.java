class Solution {
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> values=new ArrayList<>();
        inorder(root,values);
        return buildBalanced(values,0,values.size()-1);
    }
    private void inorder(TreeNode node,List<Integer> values){
        if(node==null){
            return;
        }
        inorder(node.left,values);
        values.add(node.val);
        inorder(node.right,values);
    }
    private TreeNode buildBalanced(List<Integer> values,int left, int right){
        if(left>right){
            return null;
        }
        int mid=left+(right-left)/2;
        TreeNode root=new TreeNode(values.get(mid));
        root.left=buildBalanced(values,left,mid-1);
        root.right=buildBalanced(values,mid+1,right);

        return root;
    }
}