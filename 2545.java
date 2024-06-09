// // 2545. Sort the Students by Their Kth Score

// class Solution {
//     public int[][] sortTheStudents(int[][] arr, int k) {
//         Arrays.sort(arr,(a1,a2)->{
//             int a = a1[k];
//             int b = a2[k];
//             if(a-b<0) return 1;
//             else if(a-b>0) return -1;
//             return 0;
//         });
//         return arr;
//     }
// }