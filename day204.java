class Solution {
    public int[] pathsWithMaxScore(List<String> board) {
        int n = board.size();
        int MOD = 1000000007;

        int[][] score = new int[n][n];
        int[][] ways = new int[n][n];

        for(int i=0;i<n;i++){
            Arrays.fill(score[i],-1);
        }

        score[n-1][n-1]=0;
        ways[n-1][n-1]=1;

        for(int i=n-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){

                char c=board.get(i).charAt(j);

                if(c=='X') continue;
                if(i==n-1&&j==n-1) continue;

                int max=-1;
                int cnt=0;

                int[][] dir={{1,0},{0,1},{1,1}};

                for(int[] d:dir){
                    int x=i+d[0];
                    int y=j+d[1];

                    if(x>=n||y>=n) continue;
                    if(score[x][y]==-1) continue;

                    if(score[x][y]>max){
                        max=score[x][y];
                        cnt=ways[x][y];
                    }else if(score[x][y]==max){
                        cnt=(cnt+ways[x][y])%MOD;
                    }
                }

                if(max==-1) continue;

                int val=0;
                if(c!='E'&&c!='S') val=c-'0';

                score[i][j]=max+val;
                ways[i][j]=cnt;
            }
        }

        if(ways[0][0]==0) return new int[]{0,0};

        return new int[]{score[0][0],ways[0][0]};
    }
}