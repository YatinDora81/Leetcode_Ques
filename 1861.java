// // 1861. Rotating the Box

// class Solution {
//     public char[][] rotateTheBox(char[][] box) {
        
//         int n = box.length , m = box[0].length;
//         for(int i=0;i<n;i++){
//             for(int j=m-1 ; j>=0;j--){
                
//                 if(box[i][j]=='.'){
//                     int nj = j-1;
//                     while(nj>=0 && box[i][nj]=='.'){
//                         nj--;
//                     }
//                     if(nj>=0 && box[i][nj]!='*'){
//                         box[i][j] = '#';
//                         box[i][nj] = '.';
//                     }
//                     else j = nj;
//                 }

//             }
//         }

//         char arr[][] = new char[m][n];
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 arr[j][n-1-i] = box[i][j];
//             }
//         }

//         return arr;
//     }
// }