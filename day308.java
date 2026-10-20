class Solution {
    public int findSecondMinimumValue(TreeNode root) {
        if (root == null) {
            return -1;
        }
        int min = root.val;
        return findSecond(root, min);
    }
    private int findSecond(TreeNode node, int min) {
        if (node == null) {
            return -1;
        }
        if (node.val > min) {
            return node.val;
        }
        int left = findSecond(node.left, min);
        int right = findSecond(node.right, min);
        if (left == -1) {
            return right;
        }
        if (right == -1) {
            return left;
        }
        return Math.min(left, right);
    }
}
