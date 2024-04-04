// 79. Word Search

// class Solution {
//     boolean is(int i,int j,int n,int m,char [][]arr , String word , int l){
//         if(l>=word.length()) return true;
//         if(i<0 || i>=n || j<0 ||j>=m || arr[i][j]!=word.charAt(l)) return false;

//         int dir[][]= { {0,-1},{0,1},{-1,0},{1,0} };
//         boolean ans = false;
//         arr[i][j] = '.';
//         for(int a[] : dir){
//             ans = ans | is(i+a[0] , j+a[1] ,n,m,arr,word,l+1);
//         }
//         arr[i][j] = word.charAt(l);
//         return ans;

//     }
//     public boolean exist(char[][] arr, String word) {
//         for(int i=0;i<arr.length;i++){
//             for(int j=0;j<arr[0].length;j++){
//                 if(arr[i][j]==word.charAt(0)){
//                     if( is(i,j,arr.length,arr[0].length,arr,word,0) ) return true;
//                 }
//             }
//         }
//         return false;
//     }
// }