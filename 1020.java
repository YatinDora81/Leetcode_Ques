// // 1020. Number of Enclaves

// class Solution {
//     public int numEnclaves(int[][] grid) {
//         int n = grid.length , m = grid[0].length;
//         boolean vis[][] = new boolean[n][m];
//         //upper row
//         for(int i=0;i<m;i++){
//             if( grid[0][i]==1 && !vis[0][i] ){
//                 // dfs( 0,i,n,m ,grid,vis );
//                 bfs( 0,i,n,m ,grid,vis );
//             }
//         }
//         //lower row
//         for(int i=0;i<m;i++){
//             if( grid[n-1][i]==1 && !vis[n-1][i] ){
//                 // dfs( n-1,i,n,m ,grid,vis );
//                 bfs( n-1,i,n,m ,grid,vis );
//             }
//         }
//         //first col
//         for(int i=0;i<n;i++){
//             if( grid[i][0]==1 && !vis[i][0]){
//                 // dfs( i , 0 , n , m , grid ,vis );
//                 bfs( i , 0 , n , m , grid ,vis );
//             }
//         }
//         //last col
//         for(int i=0;i<n;i++){
//             if( grid[i][m-1]==1 && !vis[i][m-1]){
//                 // dfs( i , m-1 , n , m , grid ,vis );
//                 bfs( i , m-1 , n , m , grid ,vis );
//             }
//         }

//         int ans = 0;
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 if(grid[i][j]==1 && !vis[i][j]) ans++;
//             }
//         }

//         return ans;
//     }

//     void bfs( int i,int j,int n,int m,int [][]grid, boolean vis[][] ){
//         Queue<pair> q = new LinkedList<>();
//         q.add(new pair(i,j));
//         vis[i][j] = true;
//         while(q.size()>0){
//             pair p = q.remove();

//             int dirr[][] = {{-1,0},{1,0},{0,-1},{0,1}};
//             for(int dir[] : dirr){
//                 int ni = p.a + dir[0];
//                 int nj = p.b + dir[1];
//                 if( ni>=0 && nj>=0 && ni<n && nj<m && grid[ni][nj]==1 && !vis[ni][nj] ){
//                     q.add(new pair(ni,nj));
//                     vis[ni][nj] = true;
//                 }
//             }
//         }
//     }


//     void dfs(int i,int j,int n,int m,int [][]grid,boolean vis[][]){
//         if( i<0 || j<0 || i>=n || j>=m || grid[i][j]==0 || vis[i][j] ) return ;
//         vis[i][j] = true;

//         int dirr[][] = {{-1,0},{1,0},{0,-1},{0,1}};
//         for(int dir[] : dirr){
//             int ni = i + dir[0];
//             int nj = j + dir[1];
//             dfs( ni , nj , n , m ,grid , vis );
//         }
//     }

//     public class pair{
//         int a;
//         int b;
//         public pair(int a,int b){
//             this.a=a;
//             this.b=b;
//         }
//     }
// }