// // // // 200. Number of Islands
// // // // both dfs bfs codes

// import java.util.*;

// class Solution {

//     public class Pair{
//         // // it is ised in bfs for storing the value of i and j
//         int first;
//         int second;
//         Pair(int i,int j){
//             this.first=i;
//             this.second=j;
//         }
//     }

//     public boolean issafe(int newi,int newj,int m,int n){
//         return ( newi>=0 && newi<m && newj>=0 && newj<n );
//     }
    
//     public void dfs(char[][] grid,boolean vis[][],int i,int j,int m ,int n){
//         vis[i][j]=true;
//         int dir[][]={{0,-1},{0,1},{-1,0},{1,0}};
//         for(int k=0;k<dir.length;k++){
//             int newi= i + dir[k][0];
//             int newj= j+ dir[k][1];
//             if( issafe(newi,newj,m,n) && grid[newi][newj]=='1' && !vis[newi][newj] ){
//                 dfs(grid,vis,newi,newj,m,n);
//             }
//         }
//     }

//     public int numIslands(char[][] grid) {
//         int m=grid.length;
//         int n=grid[0].length;
//         boolean vis[][]=new boolean[m][n];
//         int res=0;

//         // // //dfs
//         // for(int i=0;i<m;i++){
//         //     for(int j=0;j<n;j++){
//         //         if(grid[i][j]=='1' && !vis[i][j]){
//         //             res++;
//         //             dfs(grid,vis,i,j,m,n);
//         //         }
//         //     }
//         // }


//         // // //bfs
//         for(int i=0;i<m;i++){
//             for(int j=0;j<n;j++){
//                 if(grid[i][j]=='1' && !vis[i][j]){
//                     res++;
                    
//                     Queue<Pair> q=new LinkedList<>();
//                     q.add(new Pair(i,j));
//                     vis[i][j]=true;

//                     while(q.size()>0){
//                         Pair curr = q.remove();
//                         int curri=curr.first;
//                         int currj=curr.second;

//                         int dir[][]={{0,-1},{0,1},{-1,0},{1,0}};

//                         for(int k=0;k<dir.length;k++){
//                             int newi=curri+dir[k][0];
//                             int newj=currj+dir[k][1];

//                             if( issafe(newi,newj,m,n) && grid[newi][newj]=='1' && !vis[newi][newj] ){
//                                 q.add(new Pair(newi,newj));
//                                 vis[newi][newj]=true;
//                             }
//                         }
//                     }

//                 }
//             }
//         }

//         return res;
//     }
// }