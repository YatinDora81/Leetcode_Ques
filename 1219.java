// // 1219. Path with Maximum Gold

// class Solution {
//     public int getMaximumGold(int[][] arr) {
//         int n= arr.length;
//         int m= arr[0].length;
//         // int vis[][] = new int[n][m];

//         int ans = 0;

//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 if(arr[i][j]!=0) ans = Math.max(ans , tell(i,j,n,m,arr) );
//             }
//         }

//         return ans;
//     }
//     int tell(int i,int j,int  n,int m,int [][]arr){
//         if( i<0 || j<0 || i>=n || j>=m || arr[i][j]==0 ) return 0;
//         int ans= 0;
//         int temp= arr[i][j];
//         int dirs[][]={{0,1},{0,-1},{1,0},{-1,0}};

//         for(int dir[] : dirs){
//             arr[i][j] = 0;
//             ans = Math.max(ans ,temp +  tell(i+dir[0] , j+dir[1] , n ,m ,arr) );
//             arr[i][j]=temp;
//         }
//         return ans;
//     }
// }