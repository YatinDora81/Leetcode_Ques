// // 2577. Minimum Time to Visit a Cell In a Grid

// class Solution {
//     public class pair{
//         int i,j,t;
//         public pair(int i,int j,int t){
//             this.i=i;
//             this.j=j;
//             this.t=t;
//         }
//     }
//     public int minimumTime(int[][] grid) {
//         if( grid[0][1]>1 && grid[1][0]>1 ) return -1; // base case
//         PriorityQueue<pair> pq = new PriorityQueue<>( (a,b)->{ return a.t - b.t ;} );
//         pq.add(new pair(0,0,0));
//         int n = grid.length , m = grid[0].length;
//         boolean vis[][] = new boolean[n][m];
//         vis[0][0] = true;
//         while( pq.size()>0 ){
//             pair p = pq.remove();
//             if( p.i==n-1 && p.j==m-1 ) return p.t;
//             int dirr[][] = { {-1,0},{1,0},{0,-1},{0,1} };
//             for(int dir[] : dirr){
//                 int i = p.i + dir[0];
//                 int j = p.j + dir[1];
//                 if( i>=0 && j>=0 && i<n && j<m && !vis[i][j] ){
//                     int diff = grid[i][j] - p.t;
//                     int t = p.t;
//                     // main logic if
//                     // 0 1 1 ...
//                     if( diff<=1 ){
//                         t += 1;
//                     }
//                     else if( diff%2==0 ){
//                         // 0 1 11 ...
//                         t = grid[i][j] +1 ;
//                     }
//                     // 0 2 11 ...
//                     else t = grid[i][j];
//                     pq.add(new pair(i,j,t));
//                     vis[i][j] = true;
//                 }



//             }
//         }
//         return -1;
//     }
// }