// // 1275. Find Winner on a Tic Tac Toe Game

// class Solution {
//     public String tictactoe(int[][] moves) {
//         int arr[][] = new int[3][3];
//         for(int i=0;i<moves.length;i++){
//             arr[ moves[i][0] ][ moves[i][1] ] = i%2==0 ? 1 : 2;
//         }
        
//         // for(int a[] : arr) System.out.println(Arrays.toString(a));
//         if(is(arr , 1)) return "A";
//         if(is(arr , 2)) return "B";
//         if( moves.length>=9 ) return "Draw";
//         return "Pending";
//     }
//     boolean is( int arr[][] , int k ){
//         for(int i=0;i<3;i++){
//             for(int j=0;j<3;j++){
//                 if( arr[i][j]==k && iss( arr , i , j , k )  ){
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }

//     boolean iss(int [][]arr , int r ,int c ,int k){
        
//         boolean f = true;
//         //dia
//         for(int i=0;i<3;i++){
//             if( arr[i][i]!=k ) f = false;
//         }
//         if(f) return true;
//         f = true;
//         for(int i=0;i<3;i++){
//             if( arr[i][2-i]!=k ) f = false;
//         }
//         if(f) return true;
//         f = true;

//         for(int i=0;i<3;i++){
//             if( arr[i][c]!=k ) f = false;
//         }
//         if(f) return true;
//         f = true;
//         for(int i=0;i<3;i++){
//             if( arr[r][i]!=k ) f = false;
//         }
//         if(f) return true;

//         return false;

//     }
// }