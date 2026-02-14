class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> result = new ArrayList<>();
        dfs(root,result);
        return result;
    }
    private void dfs(Node node,List<Integer> result){
        if(node==null){
            return ;
        }
        for(int i=0;i<node.children.size();i++){
            Node child=node.children.get(i);
            dfs(child,result);
        }
        result.add(node.val);
    }
}