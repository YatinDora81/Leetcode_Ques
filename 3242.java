// // 3242. Design Neighbor Sum Service

// class neighborSum {
//     HashMap<Integer,String> map;
//     int arr[][];
//     int n;
//     public neighborSum(int[][] grid) {
//         map = new HashMap<>();
//         n = grid.length;
//         arr = grid;
//         for(int i=0;i<grid.length;i++){
//             for(int j=0;j<grid[0].length;j++){
//                 map.put(grid[i][j] , i+"-"+j);
//             }
//         }
//         // System.out.print(map);
//     }
    
//     public int adjacentSum(int value) {
//         int u=-1,d=-1,l=-1,r=-1;
//         String h[] = map.get(value).split("-");
//         int i = Integer.parseInt(h[0]);
//         int j = Integer.parseInt(h[1]);
//         if(i-1>=0) u = i-1;
//         if(i+1<n) d = i+1;
//         if(j-1>=0) l = j-1;
//         if(j+1<n) r = j+1;

//         int sum =0;
//         if(u!=-1) sum += arr[u][j];
//         if(d!=-1) sum +=arr[d][j];
//         if(l!=-1) sum += arr[i][j-1];
//         if(r!=-1) sum += arr[i][j+1];
//         return sum;
//     }
    
//     public int diagonalSum(int value) {
//         String h[] = map.get(value).split("-");
//         int i = Integer.parseInt(h[0]);
//         int j = Integer.parseInt(h[1]);
//         int sum =0;
//         if( is(i-1,j-1,n) ) sum += arr[i-1][j-1];
//         if( is(i+1,j+1,n) ) sum += arr[i+1][j+1];
//         if( is(i-1,j+1,n) ) sum += arr[i-1][j+1];
//         if( is(i+1,j-1,n) ) sum += arr[i+1][j-1];

//         return sum;
//     }

//     boolean is(int i,int j,int n){
//         return i>=0 && j>=0 && i<n && j<n;
//     }
// }

// /**
//  * Your neighborSum object will be instantiated and called as such:
//  * neighborSum obj = new neighborSum(grid);
//  * int param_1 = obj.adjacentSum(value);
//  * int param_2 = obj.diagonalSum(value);
//  */