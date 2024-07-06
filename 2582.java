// // 2582. Pass the Pillow

// class Solution {
//     public int passThePillow(int n, int time) {
//         time = time%( (2*(n-1)) );
//         boolean f = true;
//         int i=1;
//         while(time!=0){
//             if(i==n){
//                 f=false;
//             }
//             else if(i==0){
//                 f = true;
//             }
//             if(f){
//                 i++;
//             }
//             else{
//                 i--;
//             }
//             time--;
//         }
//         return i;
//     }
// }