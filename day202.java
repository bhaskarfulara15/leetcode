import java.util.*;

class Solution {
    public int findMaxPathScore(int[][] edges, boolean[] online, long k) {
        int n=online.length;

        ArrayList<int[]>[] graph=new ArrayList[n];
        for(int i=0;i<n;i++){
            graph[i]=new ArrayList<>();
        }

        int[] indegree=new int[n];
        int maxCost=0;

        for(int[] e:edges){
            graph[e[0]].add(new int[]{e[1],e[2]});
            indegree[e[1]]++;
            maxCost=Math.max(maxCost,e[2]);
        }

        int[] topo=new int[n];
        ArrayDeque<Integer> q=new ArrayDeque<>();
        int idx=0;

        for(int i=0;i<n;i++){
            if(indegree[i]==0){
                q.offer(i);
            }
        }

        while(!q.isEmpty()){
            int u=q.poll();
            topo[idx++]=u;
            for(int[] e:graph[u]){
                if(--indegree[e[0]]==0){
                    q.offer(e[0]);
                }
            }
        }

        if(!check(0,graph,topo,online,k,n)){
            return -1;
        }

        int lo=0;
        int hi=maxCost;

        while(lo<hi){
            int mid=lo+(hi-lo+1)/2;
            if(check(mid,graph,topo,online,k,n)){
                lo=mid;
            }else{
                hi=mid-1;
            }
        }

        return lo;
    }

    private boolean check(int limit,ArrayList<int[]>[] graph,int[] topo,boolean[] online,long k,int n){
        long INF=Long.MAX_VALUE/4;
        long[] dist=new long[n];
        Arrays.fill(dist,INF);
        dist[0]=0;

        for(int u:topo){
            if(dist[u]==INF){
                continue;
            }

            if(u!=0&&u!=n-1&&!online[u]){
                continue;
            }

            for(int[] e:graph[u]){
                int v=e[0];
                int w=e[1];

                if(w<limit){
                    continue;
                }

                if(v!=n-1&&!online[v]){
                    continue;
                }

                if(dist[u]+w<dist[v]){
                    dist[v]=dist[u]+w;
                }
            }
        }

        return dist[n-1]<=k;
    }
}