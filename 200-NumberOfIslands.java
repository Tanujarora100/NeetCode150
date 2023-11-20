//Time Complexity-O(M*N)

class Solution {
    public boolean check(int x, int y, char[][] grid)
    {
        if(x>=0 && y>= 0 && x<grid.length && y<grid[0].length && grid[x][y] == '1' )
            return true;
        return false;
    }
    public int numIslands(char[][] grid) {
        int[][] directions = new int[][] {{-1,0},{1,0},{0,1},{0,-1}};
       // boolean[][] visited= new boolean[grid.length][grid[0].length];
       int islands=0;
       int n=grid.length;
       int m= grid[0].length;
       for(int i=0;i<n;i++)
       {
           for(int j=0;j<m;j++)
           {
               if(grid[i][j]=='1'){
               bfs(i,j,grid,directions);
                islands++;
               }
           }
       }
       return islands;
    }
    public void bfs(int i, int j, char[][]grid, int[][] directions)
    {
        Queue<int[]> q= new LinkedList<>();
        q.offer(new int[]{i,j});
        grid[i][j]='0';
        while(!q.isEmpty())
        {
            int[] temp = q.poll();
            for(int[] dir : directions){
                int x = temp[0]+dir[0];
                int y = temp[1]+dir[1];
                if(check(x,y,grid) ){
                    q.offer(new int[] {x,y});
                    grid[x][y] ='0';
                }
                
            }
        }
    }
}
