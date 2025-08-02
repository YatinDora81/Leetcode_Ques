// class Solution {
//     public boolean isValidSudoku(char[][] arr) {
//         boolean ans = false;
//         for(int i=0;i<arr.length;i++){
//             for(int j=0;j<arr[0].length;j++){
//                 if(arr[i][j]!='.'){
//                     ans = check(arr,i,j);
//                     if(!ans) return ans;
//                 }
//             }
//         }
//         return ans;
//     }
//     public boolean check(char arr[][] , int r,int c){
//         char ch = arr[r][c];
//         for(int i=0;i<arr.length;i++) if(i!=r && arr[i][c]==ch) return false;
//         for(int i=0;i<arr[0].length;i++) if(i!=c && arr[r][i]==ch) return false;
//         // 3 * 3 square
//         int count =0;
//         int sr = (r/3) * 3;
//         int sc = (c/3) * 3;
//         for(int i=0;i<3;i++){
//             for(int j=0;j<3;j++){
//                 if(arr[i + sr][j + sc]==ch) count++;
//             }
//         }
//         return count==1;
//     }
// }
