// // 130. Surrounded Regions

// class Solution {
//     public void solve(char[][] board) {
//         int n = board.length , m = board[0].length;
//         boolean vis[][] = new boolean[n][m];

//         for(int i=0;i<m;i++){
//             if( board[0][i]=='O' ) dfs( 0 , i , n , m , board , vis );
//             if( board[n-1][i]=='O' ) dfs( n-1 , i , n , m, board , vis );
//         }

//         for(int i=0;i<n;i++){
//             if(board[i][0]=='O') dfs(i , 0 , n , m , board , vis);
//             if(board[i][m-1]=='O') dfs(i , m-1 , n , m ,board , vis);
//         }

//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 if( board[i][j]=='O' && !vis[i][j] ) board[i][j] = 'X';
//             }
//         }

//     }
//     void dfs(int i,int j,int n,int m,char [][]board , boolean [][]vis){
//         if(i<0 || j<0 || i>=n || j>=m || board[i][j]!='O' || vis[i][j] ) return;
//         vis[i][j] = true;
//         int dirr[][] = { {-1,0},{1,0},{0,-1},{0,1} };
//         for(int dir[] : dirr){
//             int ni = i+dir[0];
//             int nj = j+dir[1];
//             dfs( ni, nj , n , m , board , vis );
//         }
//     }
// }