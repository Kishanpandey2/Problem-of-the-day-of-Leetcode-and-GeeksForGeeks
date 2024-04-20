class Solution {
    public int[][] findFarmland(int[][] land) {
        boolean[][] visited = new boolean[land.length][land[0].length];
        List<int[]> ans = new ArrayList<>();
        for(int i=0;i<land.length;i++){
            for(int j=0;j<land[0].length;j++){
                if(!visited[i][j] && land[i][j]==1){
                    int i_iterator = i;
                    int j_iterator = j;
                    while(i_iterator<land.length && land[i_iterator][j]==1){
                        i_iterator++;
                    }
                    while(j_iterator<land[0].length && land[i][j_iterator]==1){
                        j_iterator++;
                    }
                    for(int v1=i;v1<i_iterator;v1++){
                        for(int v2=j;v2<j_iterator;v2++){
                            visited[v1][v2]=true;
                        }
                    }
                    ans.add(new int[]{i,j,i_iterator-1,j_iterator-1});
                }
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
}
