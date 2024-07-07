// // 1518. Water Bottles

// class Solution {
//     public int numWaterBottles(int b, int e) {
//         int ans=0;
//         while( b!=0 ){
//             if(b>=e){
//                 ans += e;
//                 b=b-e+1;
//             }else{
//                 ans+= b;
//                 b=0;
//             }
//         }
//         return ans;
//     }
// }