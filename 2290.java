// // 2290. Minimum Obstacle Removal to Reach Corner

// class Solution {
//     public class pair{
//         int x;
//         int y;
//         int c;
//         public pair(int x,int y,int c){
//             this.x=x;
//             this.y=y;
//             this.c=c;
//         }
//     }
//     public int minimumObstacles(int[][] grid) {
//         PriorityQueue<pair> pq = new PriorityQueue<>( (a,b)->{
//             if( a.c-b.c<0 ) return -1;
//             else if(a.c - b.c>0) return 1;
//             return 0;
//         } );
//         pq.add(new pair(0,0,0));
//         int n = grid.length , m = grid[0].length;

//         boolean vis[][] = new boolean[n][m];
//         while(pq.size()>0){
//             pair p = pq.remove();
//             vis[p.x][p.y] = true;
//             int dirr[][] = { {-1,0},{1,0},{0,-1},{0,1} };
//             for(int dir[] : dirr){
//                 int i = p.x + dir[0];
//                 int j = p.y + dir[1];
//                 if(i>=0 && j>=0 && i<n && j<m && !vis[i][j]){
//                     vis[i][j] = true;
//                     if(i==n-1 && j==m-1) return p.c;
//                     if( grid[i][j]==0 ){
//                         pq.add(new pair(i,j,p.c));
//                     }
//                     else{
//                         pq.add( new pair(i,j,p.c+1) );
//                     }
//                 }
//             }
//         }

//         return -1;
//     }
// }