// // 1631. Path With Minimum Effort

// class Solution {
//     public class pair{
//         int i,j,c;
//         public pair(int i,int j,int c){
//             this.i=i;
//             this.j=j;
//             this.c=c;
//         }
//     }
//     public int minimumEffortPath(int[][] arr) {
//         PriorityQueue<pair> pq = new PriorityQueue<>((a,b)->{
//             if( a.c < b.c ) return -1;
//             else if( a.c>b.c ) return 1;
//             return 0;
//         });
//         // boolean vis[][] = new boolean[arr.length][arr[0].length];

//         int ans[][] = new int[arr.length][arr[0].length];
//         for(int i[] : ans) Arrays.fill( i , (int)1e8 );
        
//         pq.add(new pair(0,0,0));
//         ans[0][0] = 0;
//         // vis[0][0] = true;
//         while(pq.size()>0){
//             pair p = pq.remove();
//             if(p.i==arr.length-1 && p.j==arr[0].length-1) return p.c;
//             // if( vis[p.i][p.j] ) continue;
//             // else vis[p.i][p.j]=true;
//             ans[p.i][p.j] = p.c;

//             int dirr[][] = { {-1,0},{1,0},{0,-1},{0,1} };
//             for(int dir[] : dirr ){
//                 int i = p.i + dir[0];
//                 int j = p.j + dir[1];

//                 if( i>=0 && j>=0 && i<arr.length && j<arr[0].length ){
//                     int c = Math.max( p.c , Math.abs(arr[i][j] - arr[p.i][p.j] ) );
//                     if( ans[i][j] > c ) pq.add(new pair( i , j , c ));
//                 }
//             }
//         }

//         return -1;
//     }
// }