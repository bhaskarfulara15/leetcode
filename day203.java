class Solution {
    public int minScore(int n, int[][] roads) {
        ArrayList<int[]>[] graph=new ArrayList[n+1];
        for(int i=1;i<=n;i++){
            graph[i]=new ArrayList<>();
        }

        for(int[] road:roads){
            graph[road[0]].add(new int[]{road[1],road[2]});
            graph[road[1]].add(new int[]{road[0],road[2]});
        }

        boolean[] vis=new boolean[n+1];
        int[] ans=new int[]{Integer.MAX_VALUE};

        dfs(1,graph,vis,ans);

        return ans[0];
    }

    public void dfs(int node,ArrayList<int[]>[] graph,boolean[] vis,int[] ans){
        vis[node]=true;

        for(int[] next:graph[node]){
            ans[0]=Math.min(ans[0],next[1]);
            if(!vis[next[0]]){
                dfs(next[0],graph,vis,ans);
            }
        }
    }
}