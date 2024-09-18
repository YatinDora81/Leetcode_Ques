// // 695. Max Area of Island

// class Solution {
//     public int maxAreaOfIsland(int[][] grid) {
//         int n = grid.length , m = grid[0].length;
//         boolean vis[][] = new boolean[n][m];
//         int ans = 0;
//         for( int i=0;i<n;i++ ){
//             for(int j=0;j<m;j++){
//                 if( grid[i][j]==1 && !vis[i][j] ){
//                     int c[] = {0};
//                     // dfs( i , j , n , m , grid , vis , c );
//                     bfs( i , j , n , m , grid , vis , c );
//                     ans = Math.max( ans , c[0] );
//                 } 
//             }
//         }
//         return ans;
//     }

//     void bfs(  int i,int j,int n,int m,int [][]grid , boolean [][]vis , int []c ){
//         Queue<pair> q = new LinkedList<>();
//         q.add( new pair( i ,  j ) );
//         vis[i][j] = true;
//         c[0] += 1;
//         while(q.size()>0){
//             pair p = q.remove();

//             int [][]dirr = { {-1,0},{1,0},{0,-1},{0,1}};
//             for(int dir[] : dirr){
//                 int ni = p.a + dir[0];
//                 int nj = p.b + dir[1];
//                 if( ni>=0 && nj>=0 && ni<n && nj<m && grid[ni][nj]==1 && !vis[ni][nj] ){
//                     q.add(new pair(ni,nj));
//                     vis[ni][nj] =  true;
//                     c[0] += 1;
//                 }
//             }
//         }
//     }

//     void dfs( int i,int j,int n,int m,int [][]grid , boolean [][]vis , int []c ){
//         if( i<0 || j<0 || i>=n || j>=m || grid[i][j]==0 || vis[i][j] ) return ;
//         vis[i][j] = true;
//         c[0] += 1;

//         int [][]dirr = { {-1,0},{1,0},{0,-1},{0,1}};
//         for(int dir[] : dirr){
//             int ni = i + dir[0];
//             int nj = j + dir[1];
//             dfs( ni , nj , n , m , grid , vis , c );
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