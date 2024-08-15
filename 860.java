// // 860. Lemonade Change

// class Solution {
//     public boolean lemonadeChange(int[] bills) {
//         int ans[]= {0,0,0};
//         for(int i : bills){
//             if(i==5) ans[0]+=1;
//             else if(i==10){
//                 if(ans[0]<1) return false;
//                 else{
//                     ans[0] -= 1;
//                     ans[1] += 1;
//                 }
//             }
//             else if(i==15){
//                 if(ans[0]<2 && ans[1]<1) return false;
//                 else if(ans[1]>0){
//                     ans[1] -= 1;
//                 }
//                 else{
//                     ans[0] -= 2;
//                 }
//                 ans[0] += 1;
//             }
//             else if(i==20){
//                 if(ans[0]<3 && (ans[0]<1 && ans[1]<1) ) return false;
//                 else if( ans[1]>0 ){
//                     ans[1] -= 1;
//                     ans[0] -= 1;
//                 }
//                 else if(ans[0]>=3){
//                     ans[0] -= 3;
//                 }
//                 else return false;
//                 ans[2] += 1;
//             }
//             if(ans[0]<0 || ans[1]<0 || ans[2]<0) return false;
//         }
//         return true;
//     }
// }