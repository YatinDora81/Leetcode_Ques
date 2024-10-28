// // 1091. Shortest Path in Binary Matrix

// class Solution {
//     public class pair{
//         int i , j;
//         public pair(int i,int j){
//             this.i = i;
//             this.j = j;
//         }
//     }
//     public int shortestPathBinaryMatrix(int[][] grid) {
//         //bfs
//         Queue<pair> q = new LinkedList<>();
//         int n = grid.length , m = grid[0].length;
//         if(grid[0][0]!=0 || grid[n-1][m-1]!=0) return -1;
//         boolean[][] vis = new boolean[n][m];
//         if( grid[0][0]==0 ){
//             q.add(new pair(0,0));
//             vis[0][0] = true;
//         }
//         int lvl = 1;

//         while(q.size()>0){
//             int S = q.size();

//             for(int s=0;s<S;s++){
//                 pair p = q.remove();
//                 if(p.i==n-1 && p.j==m-1) return lvl;
//                 int dirr[][] = { {-1,-1} , {-1,0},{-1,1} , {0,1},{1,1},{1,0},{1,-1},{0,-1} };
//                 for(int []dir : dirr){
//                     int i = p.i + dir[0];
//                     int j = p.j + dir[1];
                    
//                     if(i>=0 && j>=0 && i<grid.length && j<grid[0].length && grid[i][j]==0 && !vis[i][j] ){
//                         if(i==n-1 && j==m-1) return lvl+1;
//                         q.add(new pair(i,j));
//                         vis[i][j] = true;
//                     }
//                 }

//             }

//             lvl++;
//         }
//         return -1;
//     }
// }
