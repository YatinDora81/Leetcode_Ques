// 463. Island Perimeter


class Solution {
    public int islandPerimeter(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    return tell(i,j,n,m,grid);
                }
            }
        }
        return -1;
    }
    int tell(int i,int j,int n,int m,int [][]grid){
        if(i<0 || j<0 || i>=n || j>=m || grid[i][j]==0) return 1;
        if(grid[i][j]==2) return 0;
        grid[i][j] = 2;
        int ans= tell(i+1,j,n,m,grid) + tell(i-1,j,n,m,grid) + tell(i,j+1,n,m,grid) + tell(i,j-1,n,m,grid);
        return ans;
    }
}