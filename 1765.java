// // 1765. Map of Highest Peak

// class Solution {
//     public class pair{
//         int i , j , c;
//         public pair(int i,int j,int c){
//             this.i=i;
//             this.j=j;
//             this.c=c;
//         }
//     }
//     public int[][] highestPeak(int[][] grid) {
//         int ans[][] = new int[grid.length][grid[0].length];
//         for(int i[] : ans) Arrays.fill(i,-1);
//         Queue<pair> q = new LinkedList<>();
//         for(int i=0;i<grid.length;i++){
//             for(int j=0;j<grid[0].length;j++){
//                 if(grid[i][j]==1){
//                     q.add(new pair(i,j,0));
//                     ans[i][j] = 0;
//                 }
//             }
//         }



//         while(q.size()>0){
//             pair p = q.remove();
//             int dirr[][] = { {-1,0},{1,0},{0,-1},{0,1} };
//             for(int []dir : dirr){
//                 int i = p.i + dir[0];
//                 int j = p.j + dir[1];

//                 if( i>=0 && i<grid.length && j>=0 && j<grid[0].length && ans[i][j]==-1 ){
//                     q.add(new pair(i,j,p.c+1));
//                     ans[i][j] = p.c+1;
//                 }
//             }
//         }
//         return ans;
//     }
// }